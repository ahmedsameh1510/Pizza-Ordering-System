package pizza.ordering.system;

//importing Packages
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class PizzaOrderingSystem extends Application {
    
    //create labels
    Label welcome,lRalph,lSize,lCrust,lToppings,
            l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17
            ,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30;
    //Create Buttons
    Button Order,Menu,Back1,Back2,Finish,Clear,Another;
    //Create pane
    Pane pWelcome;
    //Create the Scenes
    Scene sWelcome,sOrder,sMenu;
    //create Radio Buttons
    RadioButton r1,r2,r3,r4,r5,r6;
    //Create Check Box
    CheckBox c1,c2,c3,c4,c5,c6;
    //defining Variables
    Double Total=0.0;
    int n;
    @Override
    public void start(Stage primaryStage) {
        //Defining Labels and Buttons
        welcome=new Label("Welcome To Our Pizza Restaurant");
        welcome.setFont(new Font(25));  //setting the size of 
        Order=new Button("Order");
        Menu=new Button("View Menu");
        Back1=new Button ("Back");
        Back2=new Button ("Back");
        //handlling the Buttons
        Order.setOnAction(e->primaryStage.setScene(sOrder));
        Menu.setOnAction(e->primaryStage.setScene(sMenu));
        Back1.setOnAction(e->primaryStage.setScene(sWelcome));
        Back2.setOnAction(e->primaryStage.setScene(sWelcome));
        
        //setting the position of the elements
        welcome.setLayoutX(18);
        welcome.setLayoutY(80);
        Order.setLayoutX(250);
        Order.setLayoutY(190);
        Menu.setLayoutX(80);
        Menu.setLayoutY(190);
        pWelcome=new Pane();
        pWelcome.getChildren().addAll(welcome,Order,Menu);
        sWelcome=new Scene(pWelcome,400,300);
        //putting he scene on the stage
        primaryStage.setTitle("Pizza Shop");
        primaryStage.setScene(sWelcome);
        primaryStage.show();
        primaryStage.setResizable(false);
        
        
        //defining a label and setting its position
        l1=new Label("Price Table For Plain Cheese Pizza");
        l1.setFont(new Font(20));
        l1.setLayoutX(20);
        l1.setLayoutY(20);
        
        //defining labels
        l2=new Label("           ");
        l3=new Label("Small      ");
        l4=new Label("Medium     ");
        l5=new Label("Large      ");
        l6=new Label("Thin       ");
        l7=new Label("5.25       ");
        l8=new Label("8.25       ");
        l9=new Label("11.25      ");
        l10=new Label("Thick      ");
        l11=new Label("6.00       ");
        l12=new Label("9.00       ");
        l13=new Label("12.00      ");
        l14=new Label("Deep Dish  ");
        l15=new Label("7.25       ");
        l16=new Label("10.25      ");
        l17=new Label("13.25      ");
        
        //degining a grid pane and adding elements to its rows and setting its position
        GridPane gp1=new GridPane();
        gp1.setVgap(20);
        gp1.setHgap(10);
        gp1.setLayoutX(30);
        gp1.setLayoutY(90);
        gp1.addRow(0,l2,l3,l4,l5);
        gp1.addRow(1,l6,l7,l8,l9);
        gp1.addRow(2, l10,l11,l12,l13);
        gp1.addRow(3,l14,l15,l16,l17);
        
        //defining label and setting its position
        l18=new Label("Price Table For Toppings");
        l18.setFont(new Font(20));
        l18.setLayoutX(490);
        l18.setLayoutY(20);
        
        //defining the labels
        l19=new Label("           ");
        l20=new Label("Small      ");
        l21=new Label("Medium     ");
        l22=new Label("Large      ");
        l23=new Label("Meet       ");
        l24=new Label("1.00       ");
        l25=new Label("1.50       ");
        l26=new Label("2.00       ");
        l27=new Label("Veggies    ");
        l28=new Label("0.50       ");
        l29=new Label("0.75       ");
        l30=new Label("1.00       ");
        
        //defining a grid pane and setting elements in it
        GridPane gp2=new GridPane();
        gp2.setVgap(20);
        gp2.setHgap(10);
        gp2.setLayoutX(450);
        gp2.setLayoutY(90);
        gp2.addRow(0,l19,l20,l21,l22);
        gp2.addRow(1,l23,l24,l25,l26);
        gp2.addRow(2,l27,l28,l29,l30);
        
        //setting the position of the button
        Back1.setLayoutX(350);
        Back1.setLayoutY(300);
        
        //definig a pane
        Pane PMenu=new Pane();
        PMenu.getChildren().addAll(l1,gp1,l18,gp2,Back1);
        
        //defining a scene
        sMenu=new Scene(PMenu,750,350);
        
        
        //definig the labeels and setting its color and size
        lRalph=new Label("Ralph's Pizza App");
        lSize=new Label("Size");
        lSize.setPrefWidth(120);
        lSize.setStyle("-fx-border-color:black; -fx-background-color: lightgray;");
        lCrust=new Label("Crust");
        lCrust.setPrefWidth(120);
        lCrust.setStyle("-fx-border-color:black; -fx-background-color: lightgray;");
        lToppings=new Label("Toppings");
        lToppings.setStyle("-fx-border-color:black; -fx-background-color: lightgray;");
        lToppings.setPrefWidth(120);
        
        //creating the radio buttons
        r1=new RadioButton("Small");
        r1.setSelected(true);
        r2=new RadioButton("Medium");
        r3=new RadioButton("Large");
        r4=new RadioButton("Thin");
        r4.setSelected(true);
        r5=new RadioButton("Thick");
        r6=new RadioButton("Deep Dish");
        
        //defining the toggle groups and adding the radio buttons to button
        ToggleGroup tSize = new ToggleGroup();
        r1.setToggleGroup(tSize);
        r2.setToggleGroup(tSize);
        r3.setToggleGroup(tSize);
        ToggleGroup tCrust = new ToggleGroup();
        r4.setToggleGroup(tCrust);
        r5.setToggleGroup(tCrust);
        r6.setToggleGroup(tCrust);
        
        //defining the checkboxes
        c1=new CheckBox("Sausage");
        c2=new CheckBox("Pepperoni");
        c3=new CheckBox("Salami");
        c4=new CheckBox("Olives");
        c5=new CheckBox("Mushrooms");
        c6=new CheckBox("Peppers");
        
        //deffinig Hboxes and Vboxes and adding the elements to them
        HBox h1=new HBox();
        h1.getChildren().addAll(r1,r2,r3);
        h1.setSpacing(50);
        VBox v1=new VBox();
        v1.getChildren().addAll(lSize,h1);
        v1.setSpacing(20);
        
        HBox h2=new HBox();
        h2.getChildren().addAll(r4,r5,r6);
        h2.setSpacing(60);
        VBox v2=new VBox();
        v2.getChildren().addAll(lCrust,h2);
        v2.setSpacing(20);
        
        VBox v3=new VBox();
        v3.getChildren().addAll(c1,c2,c3);
        v3.setSpacing(15);
        VBox v4=new VBox();
        v4.getChildren().addAll(c4,c5,c6);
        v4.setSpacing(15);
        HBox h3=new HBox();
        h3.getChildren().addAll(v3,v4);
        h3.setSpacing(60);
        VBox v5=new VBox();
        v5.getChildren().addAll(lToppings,h3);
        v5.setSpacing(20);
        
        
        //setting the position of the label
        lRalph.setLayoutX(100);
        lRalph.setLayoutY(20);
        lRalph.setFont(new Font(30));
        
        //define a Button and handle it
        Another=new Button("Add & \nOrder Another");
        Another.setOnAction(e->{
            n++;
        calculate();//call the method 
        clear();    //call  the method
        });
        
        //define a Button and handle it
        Finish=new Button("Finish");
        Finish.setOnAction(e->{
            n++;
        calculate();//call the method
        //define an alert message
        Alert message =new Alert(Alert.AlertType.INFORMATION); 
        message.setTitle(" The price ");
        message.setHeaderText("");
        message.setContentText(" order        : "+n+" Pizza\n"+" Sub Total  : "+Total+" $\n Tax            : "+(0.07*Total)+
                " $\n Total          : "+(Total+Total*0.07)+" $");
        message.showAndWait();
        clear();//call themethod
        Total=0.0;
        n=0;
        });
        //defining a button
        Clear =new Button("Clear");
        Clear.setOnAction(e->{
            clear();
            Total=0.0;
            n=0
        ;});
        //setting the size of Buttons
        Finish.setPrefSize(100, 50);
        Clear.setPrefSize(100, 50);
        //defining HBox and VBox
        HBox h4=new HBox();
        h4.getChildren().addAll(Another,Finish,Clear);
        h4.setSpacing(30);
        
        VBox v6=new VBox();
        v6.getChildren().addAll(v1,v2,v5,h4,Back2);
        v6.setSpacing(30);
        v6.setLayoutX(20);
        v6.setLayoutY(70);
        Pane POrder=new Pane();
        POrder.getChildren().addAll(lRalph,v6);
        //definig the scene
        sOrder=new Scene(POrder,430,550);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public void clear()//create a method
    {
        r1.setSelected(true);
        r4.setSelected(true);
        c1.setSelected(false);
        c2.setSelected(false);
        c3.setSelected(false);
        c4.setSelected(false);
        c5.setSelected(false);
        c6.setSelected(false);
    }
    public void calculate()//create a method that calculates the price
    {
        if(r1.isSelected())//check if r1 is selected
        {
            //check which is selected from the other radio buttons and check boxes
            if(r4.isSelected())
                Total+=5.25;
            else if(r5.isSelected())
                Total+=6.00;
            else if(r6.isSelected())
                Total+=5.25;
            if(c1.isSelected())
                Total+=1.00;
            if(c2.isSelected())
                Total+=1.00;
            if(c3.isSelected())
                Total+=1.00;
            if(c4.isSelected())
                Total+=0.50;
            if(c5.isSelected())
                Total+=0.50;
            if(c6.isSelected())
                Total+=0.50;
        }
        else if(r2.isSelected())//check if r2 is selected
        {
            //check which is selected from the other radio buttons and check boxes
            if(r4.isSelected())
                Total+=8.25;
            else if(r5.isSelected())
                Total+=9.00;
            else if(r6.isSelected())
                Total+=10.25;
            if(c1.isSelected())
                Total+=1.50;
            if(c2.isSelected())
                Total+=1.50;
            if(c3.isSelected())
                Total+=1.50;
            if(c4.isSelected())
                Total+=0.75;
            if(c5.isSelected())
                Total+=0.75;
            if(c6.isSelected())
                Total+=0.75;
        }
        else if(r3.isSelected())//check if r3 is selected
        {
            //check which is selected from the other radio buttons and check boxes
            if(r4.isSelected())
                Total+=11.25;
            else if(r5.isSelected())
                Total+=12.00;
            else if(r6.isSelected())
                Total+=13.25;
            if(c1.isSelected())
                Total+=2.00;
            if(c2.isSelected())
                Total+=2.00;
            if(c3.isSelected())
                Total+=2.00;
            if(c4.isSelected())
                Total+=1.00;
            if(c5.isSelected())
                Total+=1.00;
            if(c6.isSelected())
                Total+=1.00;
        }
    }
    
}

