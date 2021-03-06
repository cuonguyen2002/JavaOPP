package lesson25.Ex3;

import java.util.Date;

public abstract class Person {
    private String idCard;  //số thẻ căn cước
    private FullName fullName;  //họ và tên
    private String address;  //địa chỉ
    private Date dayOfBirth;  //ngày sinh
    private String email;  //email
    private String phoneNumber;  //số điện thoại



    public Person(String idCard, String fullName, String address,
                  Date dayOfBirth, String email, String phoneNumber) {
        this.idCard = idCard;
        this.setFullName(fullName);
        this.address = address;
        this.dayOfBirth = dayOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }



    public final String getIdCard() {
        return idCard;
    }

    public final void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public final String getFullName() {
        return fullName.fistName + fullName.midName + " " + fullName.lastName;
    }

    public final void setFullName(String fullName) {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() > 0) {
            String[] words = fullName.split("\\s+");
            this.fullName.fistName = words[0];
            this.fullName.lastName = words[words.length - 1];
            this.fullName.midName = "";
            for (int i = 1; i < words.length - 1; i++) {
                this.fullName.midName += words[i] + " ";
            }
        }
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public final Date getDayOfBirth() {
        return dayOfBirth;
    }

    public final void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public final String getPhoneNumber() {
        return phoneNumber;
    }

    public final void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




    public void eat() {
        System.out.println(getFullName() + " đang ăn");
    }

    public void sleep() {
        System.out.println(getFullName() + " đang ngủ");
    }

    protected abstract void work();  //làm việc

    public void talk() {
        System.out.println(getFullName() + " đang nói chuyện");
    }

    public void relax() {
        System.out.println(getFullName() + " đang giải trí");
    }




    class FullName {
        private String fistName;
        private String midName;
        private String lastName;

        public FullName() {

        }


        public final String getFistName() {
            return fistName;
        }

        public final void setFistName(String fistName) {
            this.fistName = fistName;
        }

        public final String getMidName() {
            return midName;
        }

        public final void setMidName(String midName) {
            this.midName = midName;
        }

        public final String getLastName() {
            return lastName;
        }

        public final void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
}




