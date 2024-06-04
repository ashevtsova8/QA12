package lesson5;

public class ValidatePhoneNumber {
    private static String phoneStart = "+375";

    {
        //внутренний класс в блоке кода
        class PhoneNumber {
//            static int x = 0; нельзя создать статическую переменную внутри локального класса
            private String phoneNumber;

            PhoneNumber(String phoneNumber){
                this.phoneNumber = phoneNumber;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }
        }
    }

    public void validatePhoneNumber(String phone) {
        String numberStart = "+7";
        numberStart = "8";
        String finalNumberStart = numberStart;

//        static int x = 0; этот код не скомпилируется
        //внутренний класс в локальном методе
        class PhoneNumber {
            private String phoneNumber;

            PhoneNumber(String phoneNumber){
                this.phoneNumber = phoneNumber;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public void printRussianCode(){
                System.out.println(finalNumberStart);
            }

            public String getPhoneStart(){
                return phoneStart;
            }

            //нельзя создать статический метод во внутреннем классе
//            public static void getNumberStart() {
//                System.out.println(numberStart);
//            }
        }
    }

    public void validatePhoneNumber1(String phone) {
        //класс в цикле
//        PhoneNumber phoneNumber = PhoneNumber(); экземпляр внутреннего класса в локальном
//        методе/блоке кода/цикле нельзя создать за их пределами
        for (int i = 0; i < 5; i++) {
            class PhoneNumber {
                private String phoneNumber;

                PhoneNumber(String phoneNumber){
                    this.phoneNumber = phoneNumber;
                }

                public String getPhoneNumber() {
                    return phoneNumber;
                }

                public void setPhoneNumber(String phoneNumber) {
                    this.phoneNumber = phoneNumber;
                }
            }
        }

    }
}
