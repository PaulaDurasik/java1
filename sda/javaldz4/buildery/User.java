package com.sda.javaldz4.buildery;

public class User {
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private int phone;
        public User(UserBuilder userBuilder){
            this.firstName=userBuilder.firstName;
            this.lastName=userBuilder.lastName;
            this.address=userBuilder.addres;
            this.age=userBuilder.age;
            this.phone=userBuilder.phone;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }


    public int getPhone() {
        return phone;
    }

    @Override
        public String toString() {
            return "UserBuilder{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    ", phone"+ phone+
                    '}';
        }
    public static class UserBuilder{
        private String firstName;
        private String lastName;
        private int age;
        private String addres;
        private int phone;

        public UserBuilder(String firstName) {
            this.firstName = firstName;
        }
        public UserBuilder firstName (String firstName) {
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName (String lastName){
            this.lastName=lastName;
            return this;
        }
        public UserBuilder age(int age){
            this.age=age;
            return this;
        }
        public UserBuilder addres(String addres){
            this.addres=addres;
            return this;
        }
        public UserBuilder phone(int phone){
            this.phone=phone;
            return this;
        }

        public User build(){
            User user=new User(this);
            return user;
        }

    }
}
