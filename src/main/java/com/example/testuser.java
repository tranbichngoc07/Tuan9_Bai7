package com.example;

public class testuser { // Lỗi: Tên class phải đặt theo PascalCase (TestUser)
    private String name ; // Lỗi: Khoảng trắng thừa trước dấu chấm phẩy
    private int Age; // Lỗi: Tên trường phải đặt theo camelCase (age)
    private boolean IsValid; // Lỗi: Tên trường boolean không được dùng tiền tố


    public void set_name(String n) { // Lỗi: Tên phương thức phải đặt theo camelCase (setName)
        this.name = n;
    }



    public static void main(String[] args) { // Phương thức chính với các lỗi
          testuser u = new testuser();
        u.set_name("Test");
        if(u.IsValid == true) { // Lỗi: So sánh trực tiếp với true
            System.out.println("Valid user"); // Lỗi: Thiếu khoảng trắng sau dấu đóng ngoặc, thừa khoảng trắng trước dấu mở ngoặc
        } else {
            System.out.println("Invalid user");
        }
    }
}
