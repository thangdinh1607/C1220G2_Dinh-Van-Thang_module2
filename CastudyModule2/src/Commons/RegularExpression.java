package Commons;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static final String ID_VILLA = "^(SVVL)\\d{4}";
    public static final String ID_HOUSE = "^(SVHO)\\d{4}";
    public static final String ID_ROOM = "^(SVRO)\\d{4}";

    public static final String NAME_SERVICES = "^([A-Z]\\w+ )+[A-Z]\\w+$";
    public static final String AREA_USED = "^[3-9][0-9](.)(\\d)+$";
    public static final String RENTAL_COST = "^\\d+(.)(\\d)+$";
    public static final String NUMBER_OF_PEOPLE = "^(0|1)\\d$";
    public static final String NUMBER_OF_FLOOR = "^\\d{2}$";

    public static final String NAME_CUSTOMER = "^([A-Z]\\w+ )+[A-Z]\\w+$";
    public static final String EMAIL_CUSTOMER = "^([A-Za-z\\d])+@([a-z]+.){1,2}([a-z]{3}|[a-z]{3}.vn)$";
    public static final String GENDER_CUSTOMER = "^(male|female|unknow)$";
    public static final String IDCARD_CUSTOMER = "^(\\d){9}$";
    public static final String PHONE_CUSTOMER = "^(\\d){10}$";
    public static final String BIRTHDAY_CUSTOMER = "^(([0-2]\\d)|3(0|1))(/|.)((0[\\d])|(1[0-2]))(/|.)((19\\d\\d)|(200[0-3]))$";
    public static final String TYPEOF_CUSTOMER = "^(vip|normal)$";

    private Pattern pattern;
    private Matcher matcher;
    Scanner scanner = new Scanner(System.in);
    boolean check = false;


    public String checkNameServices() {
        String nameServices = null;
        do {
            System.out.println("Enter name services--Thang Dinh :");
            nameServices = scanner.nextLine();
            check = Pattern.compile(NAME_SERVICES).matcher(nameServices).matches();
        } while (!check);
        return nameServices;
    }

    public double checkAreaUsed() {
        String areaUsed = null;
        do {
            System.out.println("Enter area used :");
            areaUsed = scanner.nextLine();
            check = Pattern.compile(AREA_USED).matcher(areaUsed).matches();
        } while (!check);
        return Double.parseDouble(areaUsed);
    }

    public double checkRentalCost() {
        String rentalCost = null;
        do {
            System.out.println("Enter RentalCost :");
            rentalCost = scanner.nextLine();
            check = Pattern.compile(RENTAL_COST).matcher(rentalCost).matches();
        } while (!check);
        return Double.parseDouble(rentalCost);
    }

    public int checkNumberOfPeople() {
        String numberOfPeople = null;
        do {
            System.out.println("Enter numberOfPeople :");
            numberOfPeople = scanner.nextLine();
            check = Pattern.compile(NUMBER_OF_PEOPLE).matcher(numberOfPeople).matches();
        } while (!check);
        return Integer.parseInt(numberOfPeople);
    }

    public String checkTypeOfRent() {
        String typeOfRent = null;
        do {
            System.out.println("Enter typeOfRent :");
            typeOfRent = scanner.nextLine();
            check = Pattern.compile(NAME_SERVICES).matcher(typeOfRent).matches();
        } while (!check);
        return typeOfRent;
    }

    //-------------villa
    public String checkStandardRoom() {
        String standardRoom = null;
        do {
            System.out.println("Enter standardRoom :");
            standardRoom = scanner.nextLine();
            check = Pattern.compile(NAME_SERVICES).matcher(standardRoom).matches();
        } while (!check);
        return standardRoom;
    }

    public String checkOtherFacilities() {
        String otherFacilities = null;
        do {
            System.out.println("Enter otherFacilities :");
            otherFacilities = scanner.nextLine();
            check = Pattern.compile(NAME_SERVICES).matcher(otherFacilities).matches();
        } while (!check);
        return otherFacilities;
    }

    public double checkAreaPool() {
        String areaPool = null;
        do {
            System.out.println("Enter areaPool :");
            areaPool = scanner.nextLine();
            check = Pattern.compile(AREA_USED).matcher(areaPool).matches();
        } while (!check);
        return Double.parseDouble(areaPool);
    }

    public int checkNumberOfFloor() {
        String numberOfFloor = null;
        do {
            System.out.println("Enter numberOfFloor :");
            numberOfFloor = scanner.nextLine();
            check = Pattern.compile(NUMBER_OF_FLOOR).matcher(numberOfFloor).matches();
        } while (!check);
        return Integer.parseInt(numberOfFloor);
    }

    //    ----------ROOM--------------
    public String checkFreeServices() {
        String freeService = null;
        do {
            System.out.println("Enter Free Services :");
            freeService = scanner.nextLine();
            check = Pattern.compile(NAME_SERVICES).matcher(freeService).matches();
        } while (!check);
        return freeService;
    }

    //----Customer-------------------------------------------------------------------------------------
    public String checkNameCustomer() throws NameException {
        String nameCustomer = null;
        do {
            try {
                System.out.println("Enter name Customer");
                nameCustomer = scanner.nextLine();
                check = Pattern.compile(NAME_CUSTOMER).matcher(nameCustomer).matches();
                if (!check) {
                    throw new NameException("false format");
                }
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return nameCustomer;
    }

    public String checkEmailCustomer() throws EmailException {
        String emailCustomer = null;
        do {
            try {
                System.out.println("Enter email Customer");
                emailCustomer = scanner.nextLine();
                check = Pattern.compile(EMAIL_CUSTOMER).matcher(emailCustomer).matches();
                if (!check) {
                    throw new EmailException("false format-- abc@abc.com");
                }
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return emailCustomer;
    }
    public String typeOfCustomer() throws TypeOfCustomerException {
        String typeOfCustomer = null;
        do {
            try {
                System.out.println("Enter type of Customer");
                typeOfCustomer = scanner.nextLine();
                check = Pattern.compile(TYPEOF_CUSTOMER).matcher(typeOfCustomer).matches();
                if (!check) {
                    throw new TypeOfCustomerException("false format-- (vip|normal)");
                }
            } catch (TypeOfCustomerException e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return typeOfCustomer;
    }


    public String checkGenderCustomer()throws GenderException {
        String genderCustomer = null;

        do {
            try {
                System.out.println("Enter gender Customer");
                genderCustomer = scanner.nextLine().toLowerCase();
                check = Pattern.compile(GENDER_CUSTOMER).matcher(genderCustomer).matches();
                if (!check) {
                    throw new GenderException("false format---male|female|unknow");
                }
            } catch (GenderException e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return genderCustomer;
    }

    public int checkIdCardCustomer() throws IdCardException {
        String idCardCustomer = null;

        do {
            try {
                System.out.println("Enter idCard Customer");
                idCardCustomer = scanner.nextLine();
                check = Pattern.compile(IDCARD_CUSTOMER).matcher(idCardCustomer).matches();
                if (!check) {
                    throw new IdCardException("false format ---XXX-XXX-XXX");
                }
            } catch (IdCardException e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return Integer.parseInt(idCardCustomer);
    }
    public int checkPhoneNumberCustomer() throws PhoneNumberException {
        String phoneNumber = null;

        do {
            try {
                System.out.println("Enter phoneNumber Customer");
                phoneNumber = scanner.nextLine();
                check = Pattern.compile(PHONE_CUSTOMER).matcher(phoneNumber).matches();
                if (!check) {
                    throw new PhoneNumberException("false format ---XXXx-XXX-XXX");
                }
            } catch (PhoneNumberException e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return Integer.parseInt(phoneNumber);
    }

    public String checkBirthDayCustomer() {
        String birthDayCustomer = null;
        do {
            try {
                System.out.println("Enter birthday Customer");
                birthDayCustomer = scanner.nextLine();
                check = Pattern.compile(BIRTHDAY_CUSTOMER).matcher(birthDayCustomer).matches();
                if (!check) {
                    throw new NameException("false format -- dd/mm/yyyy");
                }
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        } while (!check);
        return birthDayCustomer;
    }
    public String checkAddressCustomer(){
        String address=null;
        System.out.println("Enter address customer :");
        return address=scanner.nextLine();
    }
}