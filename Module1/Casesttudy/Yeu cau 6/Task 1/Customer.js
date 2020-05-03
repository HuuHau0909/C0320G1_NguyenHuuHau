class Customer {
    constructor() {
    }

    setName(name) {
        this.name = name;
    }

    getName() {
        return this.name;
    }

    setCMND(cmnd) {
        this.cmnd = cmnd;
    }

    getCMND() {
        return this.cmnd;
    }

    setBirthday(birthday) {
        this.birthday = birthday
    }

    getBirthday() {
        return this.birthday
    }


    setEmail(email) {
        this.email = email;
    }

    getEmail() {
        return this.email;
    }


    setAdress(adress) {
        this.adress = adress;
    }

    getAdress() {
        return this.adress
    }

    settypeCustomer(typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    gettypeCustomer() {
        return this.typeCustomer
    }

    setdiscount(discount) {
        this.discount = discount;
    }

    getdiscount() {
        return this.discount;
    }

    setquantityInclue(quantityInclue) {
        this.quantityInclue = quantityInclue;
    }

    getquantityInclue() {
        return this.quantityInclue
    }

    setrenDays(renDays) {
        this.renDays = renDays;
    }

    getrenDays() {
        return this.renDays;
    }

    settypeService(typeService) {
        this.typeService = typeService
    }

    gettypeService() {
        return this.typeService;
    }

    settypeRoom(typeRoom) {
        this.typeRoom = typeRoom;
    }

    gettypeRoom() {
        return this.typeRoom;
    }

    totalPay() {
        let price = 0;
        if (this.typeService === 'Villa') {
            price = 500;
        } else if (this.typeService === 'House') {
            price = 300;
        } else if (this.typeService === 'Room') {
            price = 100;
        }
        return price * this.renDays * (1 - this.discount / 100);
    }
}

