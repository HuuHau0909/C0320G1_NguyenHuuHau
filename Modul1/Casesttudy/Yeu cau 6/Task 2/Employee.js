let Employee = function () {
    this.getName = function () {
        return this.name;
    }
    this.getBirthday = function () {
        return this.birthday;
    }
    this.getId = function () {
        return this.id;
    }
    this.getPhone= function () {
        return this.phone;
    }
    this.getEmail = function () {
        return this.email;
    }
    this.getLevel = function () {
        return this.level;
    }
    this.getPosition = function () {
        return this.position;
    }
    this.getSalary = function () {
        if (this.getPosition() === 'Manager') {
            this.salary = 500;
        } else if (this.getPosition() === 'Sale') {
            this.salary = 300;
        } else if (this.getPosition() === 'Makerting') {
            this.salary = 200;
        }
        return this.salary;
    }
    this.setName = function (name) {
        this.name = name;
    }
    this.setBirthday = function (birthday) {
        this.birthday = birthday;
    }
    this.setId = function (id) {
        this.id = id;
    }
    this.setPhone = function (phone) {
        this.phone = phone;
    }
    this.setEmail = function (email) {
        this.email = email;
    }
    this.setLevel = function (level) {
        this.level = level;
    }
    this.setPosition = function (position) {
        this.position = position;
    }
}