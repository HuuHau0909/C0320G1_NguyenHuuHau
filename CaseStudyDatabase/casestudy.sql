CREATE TABLE loai_dich_vu (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ten_loai_dich_vu VARCHAR(50)
);

CREATE TABLE kieu_thue (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ten_kieu_thue VARCHAR(50),
    gia FLOAT
);

CREATE TABLE dich_vu (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ten_dich_vu VARCHAR(50),
    dien_tich_su_dung DOUBLE,
	so_tang INT,
   	so_luong_nguoi_toi_da INT,
	gia_thue DOUBLE,
    id_kieu_thue int, foreign key (id_kieu_thue) references kieu_thue(id),
    id_loai_dich_vu int, foreign key (id_loai_dich_vu) references loai_dich_vu(id),
    trang_thai VARCHAR(15)
);

CREATE TABLE dich_vu_di_kem (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ten_dich_vu_di_kem VARCHAR(30),
    Don_vi INT,
    gia_tien FLOAT,
    trang_thai_su_dung VARCHAR(10)
);

CREATE TABLE nhan_vien (
    ma_nhan_vien INT AUTO_INCREMENT PRIMARY KEY,
    ten_nhan_vien VARCHAR(100),
    id_trinh_do INT,
    FOREIGN KEY (id_trinh_do)
        REFERENCES trinh_do (id),
    id_bo_phan INT,
    FOREIGN KEY (id_bo_phan)
        REFERENCES bo_phan (id),
    id_vi_tri INT,
    FOREIGN KEY (id_vi_tri)
        REFERENCES vi_tri (id),
    luong FLOAT,
    ngay_sinh DATE,
    cmnd VARCHAR(15),
    dien_thoai VARCHAR(15),
    email VARCHAR(45),
    dia_chi VARCHAR(45)
);

CREATE TABLE trinh_do (
    id INT AUTO_INCREMENT PRIMARY KEY,
    trinh_do VARCHAR(45)
);

CREATE TABLE vi_tri (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ten_vi_tri VARCHAR(50)
);

CREATE TABLE bo_phan (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ten_bo_phan VARCHAR(30)
);

CREATE TABLE khach_hang (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_loai_khach INT,
    FOREIGN KEY (id_loai_khach)
        REFERENCES loai_khach (id),
    ho_ten VARCHAR(100),
    ngay_sinh DATE,
    gioi_tinh VARCHAR(10),
    cmnd VARCHAR(15),
    dien_thoai VARCHAR(15),
    email VARCHAR(45),
    dia_chi VARCHAR(45)
);

CREATE TABLE loai_khach (
    id INT AUTO_INCREMENT PRIMARY KEY,
    loai_khach VARCHAR(10)
);

CREATE TABLE hop_dong_chi_tiet (
    so_hop_dong_chi_tiet INT AUTO_INCREMENT PRIMARY KEY,
    so_hop_dong_chinh INT,
    FOREIGN KEY (so_hop_dong_chinh)
        REFERENCES hop_dong (so_hop_dong),
    id_dich_vu_di_kem INT,
    FOREIGN KEY (id_dich_vu_di_kem)
        REFERENCES dich_vu_di_kem (id),
    so_luong INT
);

CREATE TABLE hop_dong (
    so_hop_dong INT AUTO_INCREMENT PRIMARY KEY,
    id_khach_hang INT,
    FOREIGN KEY (id_khach_hang)
        REFERENCES khach_hang (id),
    id_dich_vu INT,
    FOREIGN KEY (id_dich_vu)
        REFERENCES dich_vu (id),
    id_nhan_vien INT,
    FOREIGN KEY (id_nhan_vien)
        REFERENCES nhan_vien (ma_nhan_vien),
    ngay_bat_dau DATE,
    ngay_ket_thuc DATE,
    tien_coc_truoc FLOAT,
    tien_thanh_toan FLOAT
);

ALTER TABLE trinh_do MODIFY trinh_do varchar(45);

drop database casestudy;
create database casestudy;
ALTER TABLE khach_hang MODIFY ngay_sinh datetime;
ALTER TABLE khach_hang MODIFY ngay_sinh date;
select date_format (ngay_sinh,'%d/%m/%y') from khach_hang;

-- Task 2
select * from casestudy.nhan_vien where (ten_nhan_vien like 'H%' or ten_nhan_vien like 'T%' or ten_nhan_vien like 'K%') and (length(ten_nhan_vien)>15);

-- Task 3
select * from casestudy.khach_hang where (((datediff (curdate(),ngay_sinh))/365<50) and (datediff (curdate(),ngay_sinh))/365>18) 
and dia_chi in ('Đà Nẵng' ,'Quảng Trị');

-- Task 4
select khach_hang.ho_ten, count(hop_dong.so_hop_dong) as so_lan_dat_phong
from hop_dong join khach_hang on khach_hang.id=hop_dong.id_khach_hang
where khach_hang.id_loai_khach=1
group by (khach_hang.id) order by so_lan_dat_phong;

-- Task 5
select khach_hang.id,khach_hang.ho_ten,loai_khach.loai_khach,hop_dong.so_hop_dong,
dich_vu.ten_dich_vu,hop_dong.ngay_bat_dau,hop_dong.ngay_ket_thuc,
sum(dich_vu.gia_thue+dich_vu_di_kem.gia_tien*hop_dong_chi_tiet.so_luong) as tong_tien
from khach_hang
left join hop_dong on khach_hang.id=hop_dong.id_khach_hang
left join loai_khach on khach_hang.id_loai_khach = loai_khach.id
left join dich_vu on hop_dong.id_dich_vu = dich_vu.id
left join hop_dong_chi_tiet on hop_dong.so_hop_dong = hop_dong_chi_tiet.so_hop_dong_chinh
left join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id
group by khach_hang.id;

-- Task 6
select dich_vu.id, dich_vu.ten_dich_vu,dich_vu.dien_tich_su_dung,dich_vu.gia_thue,
loai_dich_vu.ten_loai_dich_vu
from dich_vu
join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id
join hop_dong on dich_vu.id = hop_dong.id_dich_vu
where not exists ( select hop_dong.ngay_bat_dau where(hop_dong.ngay_bat_dau between '2019-01-01' and '2019-03-31'));

-- Task 7
select dich_vu.id, dich_vu.ten_dich_vu,dich_vu.dien_tich_su_dung,dich_vu.so_luong_nguoi_toi_da,
dich_vu.gia_thue, loai_dich_vu.ten_loai_dich_vu
from dich_vu
join loai_dich_vu on dich_vu.id_loai_dich_vu = loai_dich_vu.id
join hop_dong on dich_vu.id = hop_dong.id_dich_vu
where exists ( select hop_dong.ngay_bat_dau where(hop_dong.ngay_bat_dau between '2010-01-01' and '2010-12-31'))
and not exists ( select hop_dong.ngay_bat_dau where(hop_dong.ngay_bat_dau between '2019-01-01' and '2019-12-31'));

-- Task 8
-- Cách 1
select distinct id, ho_ten from khach_hang;
-- Cách 2
select id, ho_ten from khach_hang group by ho_ten;
-- Cách 3
select ho_ten from khach_hang union select ho_ten from khach_hang;

-- Task 9
select temp.month, count(month(hop_dong.ngay_bat_dau)) as so_hop_dong_trong_thang, 
sum(hop_dong.tien_thanh_toan) as TongTien from
(select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as temp
left join hop_dong on month(hop_dong.ngay_bat_dau) = temp.month
-- left join khach_hang on khach_hang.id = hop_dong.id_khach_hang
where year(hop_dong.ngay_bat_dau) = '2019' or year(hop_dong.ngay_bat_dau) is null or month(hop_dong.ngay_bat_dau) is null
group by temp.month
order by temp.month desc;

-- Task 10 
-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (được tính dựa trên việc count các IDHopDongChiTiet).

select hd.so_hop_dong, hd.ngay_bat_dau, hd.ngay_ket_thuc, hd.tien_coc_truoc 

, count(hop_dong_chi_tiet.so_hop_dong_chi_tiet) as SoLuongDichVuDiKem
from hop_dong hd
left join hop_dong_chi_tiet  on hd.so_hop_dong = hop_dong_chi_tiet.so_hop_dong_chinh
group by hd.so_hop_dong;

-- Task 11
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có 
-- TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”
select dich_vu_di_kem.ten_dich_vu_di_kem 
from khach_hang
left join hop_dong on khach_hang.id = hop_dong.id_khach_hang
left join hop_dong_chi_tiet on hop_dong.so_hop_dong = hop_dong_chi_tiet.so_hop_dong_chinh
left join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id
left join loai_khach on khach_hang.id_loai_khach = loai_khach.id
where loai_khach.loai_khach = 'Diamond' and (khach_hang.dia_chi = 'Vinh' or khach_hang.dia_chi = 'Quảng Ngãi');

-- Task 12
-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, 
-- TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), 
-- TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019

select hd.so_hop_dong,nv.ten_nhan_vien,kh.ho_ten,
kh.dien_thoai,dv.ten_dich_vu, count(hdct.id_dich_vu_di_kem) as SoLuongDichVuDiKem
-- select*
from hop_dong hd
join khach_hang kh on hd.id_khach_hang = kh.id
join nhan_vien nv on hd.id_nhan_vien = nv.ma_nhan_vien
join dich_vu dv on hd.id_dich_vu = dv.id
join hop_dong_chi_tiet hdct on hd.so_hop_dong = hdct.so_hop_dong_chinh
where not exists

customers
