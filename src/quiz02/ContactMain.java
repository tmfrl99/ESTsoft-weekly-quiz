package quiz02;

import java.util.Scanner;

public class ContactMain {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1. 비즈니스 연락처 추가\n2. 개인 연락처 추가" +
                    "\n3. 연락처 출력\n4. 연락처 검색\n5. 종료\n메뉴를 선택해주세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                System.out.print("이름을 입력하세요: ");
                String name = scanner.nextLine();

                System.out.print("전화번호를 입력하세요: ");
                String phoneNumber = scanner.nextLine();

                System.out.print("회사명을 입력하세요: ");
                String company = scanner.nextLine();

                addressBook.addContact(new BusinessContact(name, phoneNumber, company));
            } else if (menu == 2) {
                System.out.print("이름을 입력하세요: ");
                String name = scanner.nextLine();

                System.out.print("전화번호를 입력하세요: ");
                String phoneNumber = scanner.nextLine();

                System.out.print("관계를 입력하세요: ");
                String relationship = scanner.nextLine();

                addressBook.addContact(new PersonalContact(name, phoneNumber, relationship));
            } else if (menu == 3) {
                addressBook.displayContacts();
            } else if (menu == 4) {
                System.out.print("검색할 이름을 입력하세요: ");
                addressBook.searchContact(scanner.nextLine());
            } else if (menu == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 번호를 선택했습니다.");
            }
        }
    }
}
