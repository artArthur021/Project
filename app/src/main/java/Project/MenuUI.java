package Project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuUI {
    public MenuUI(Stage primaryStage) {
        // สร้างเมนูบาร์
        MenuBar menuBar = new MenuBar();
        
        // สร้างเมนูหลัก
        Menu name = new Menu("NameMenu");
        Menu price = new Menu("Price");
        
        // สร้างรายการเมนู
        MenuItem displayMenu = new MenuItem("displayMenu");
        MenuItem AddItem = new MenuItem("AddItem");
        MenuItem findItem = new MenuItem("findItem");
        MenuItem exitItem = new MenuItem("exitIem ");
        
        // เพิ่ม ActionListener ให้เมนู Exit
        exitItem.setOnAction(e -> System.exit(0));
        
        // เพิ่มรายการเมนูเข้าไปในเมนู File
        name.getItems().addAll(displayMenu, AddItem,findItem, new SeparatorMenuItem(), exitItem);
        
        // เพิ่มเมนูหลักเข้าไปในแถบเมนู
        menuBar.getMenus().addAll(name, price);
        
        // จัดการ Layout
        VBox root = new VBox(menuBar);

        // root.getChildren().addAll(fileMenu);
        Scene scene = new Scene(root, 400, 300);
        
        // ตั้งค่าหน้าต่างหลัก
        primaryStage.setTitle("Menu UI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

