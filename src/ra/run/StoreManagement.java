package ra.run;

import ra.entity.Product;
import ra.util.ArrayTest;
import ra.util.InputMethod;

import java.util.Optional;
import java.util.Scanner;

public class StoreManagement {
    // validate
    private static final  String ID_PATTERN_PRODUCT = "^[A-Z]\\w{3}$";
    public static ArrayTest<Product> products= new ArrayTest<>();

    public static void main(String[] args) {
        Product p = null;
        Optional<Product> productOptional  = Optional.ofNullable(p);
        productOptional.orElse(new Product());
        while (true){


            System.out.println("=============Menu===========");
            System.out.println("1. Nhập thông tin san phẩm mới       ");
            System.out.println("2. hiển thị             ");
            System.out.println("3. Cập nhật theo id        ");
            System.out.println("4. tìm kiếm             ");
            System.out.println("5. cập nhật trạng thái");
            System.out.println("6. thoát");
            System.out.println("Nhập lựa chọn của bạn");
            byte choice = InputMethod.getByte();
            switch (choice){
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    displayProductList();
                    break;
                case 3:
                    // cập nhật theo id
                    updateProduct();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("quay lại");
                    break;
                default:
                    System.err.println("Nhập sai");

            }
            if (choice ==6){
                break;
            }
        }
    }
    // thêm mới ;
    public static void addNewProduct(){
        // khởi tạo product
        Product newProduct = new Product();
        // nhập id
        while (true){
            System.out.println("Nhập id");
            String idInput = InputMethod.getString();
            if(idInput.matches(ID_PATTERN_PRODUCT)){
                if (checkExistByIdProduct(idInput)){
                    System.err.println("Đã tồn tại");
                    continue;
                }
                newProduct.setProductId(idInput);
                break;

            }

            System.err.println("Khong đúng định dạng");
        }
        newProduct.inputData();
        // thêm mới
        products.add(newProduct);
        System.out.println("thêm mới thành công");

    }
    public static boolean checkExistByIdProduct(String id){
        for (int i = 0; i < products.getCount(); i++) {
            if(products.get(i).getProductId().equals(id)){
                return true;
            }
        }
        return false;
    }

    public static void displayProductList(){
        for (int i = 0; i < products.getCount(); i++) {
           products.get(i).displayData();
        }
    }
    // cập nhật
    public static void updateProduct (){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập id cần sửa");
        String id = InputMethod.getString();
        int index = getIndexByProductId(id);
        if (index != -1){
            // tồn tại , cho phép sửa
            System.out.println("thông tin cũ");
            Product productEdit = products.get(index);
            productEdit.displayData();
            System.out.println("Nhập thông tin mới");
            System.out.println("Nhập tên mới");
            String newName = sc.nextLine();
            if(!newName.trim().equals("")){
              // lấy giá trị mới
                productEdit.setProductName(newName);
            }
            System.out.println("Nhập nhà sản xuất mới");
            String newManufacturer = sc.nextLine();
            if(!newManufacturer.trim().equals("")){
              // lấy giá trị mới
                productEdit.setManufacturer(newManufacturer);
            }
            // thông báo
            System.out.println("Cập nhật thành công");

        }else {
            System.err.println("Id không tồn tại");
        }
    }
    public static int getIndexByProductId(String idPro){
        for (int i = 0; i < products.getCount(); i++) {
          if (products.get(i).getProductId().equals(idPro)){
                return i;
            }
        }
        return -1;
    }
}
