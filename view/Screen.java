/** 
* <h1>Screen</h1>
* Interface des écrans. Chaque écran représente une étape lors du processus de PM.
* @author Alexis TADIFO
* @version 0.1 
* @since 2018/11/10 
*/

package procuryx.view;

import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.FileChannel;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import Dimensions;

	
public class Screen extends Application {
    	private Text label = new Text();
    	private ImageView background ;
    	private String folderUrl ;    
   	private int dim_length;
	private int dim_height;
    	private StringProperty title_pr = new SimpleStringProperty();
    	private int dim_max_length;
    	private int dim_max_height;
	private String icon_url;    
    	private String file_to_decomp ;
	private Dimensions dim = new Dimensions();
	private Dimensions dim_max = new Dimensions();
   
	
	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle(label.toString());       
        primaryStage.initStyle(StageStyle.TRANSPARENT);
         // On initialise la taille de la fenêtre
        primaryStage.setMaxHeight(dim_max.getHeight());
        primaryStage.setMaxWidth(dim_max.getWidth());
        StackPane root = new StackPane();
        
        
        // ++++ INITIALISATION DU PROCESSUS ++++
        // -------------- Sélection du fichier à dézipper et du dossier d'installation -----------------
        Scene scene = new Scene(root, dim.getWidth(), dim.getHeight(), Color.WHITE);
        scene.heightProperty().add(primaryStage.heightProperty());
        scene.widthProperty().add(primaryStage.widthProperty());
        primaryStage.setScene(scene);
        primaryStage.setIconified(true);
        
        // Insertion du background
        background = ImageProvider.getImageViewFromURI(ImageProvider.FOND_BLANC);
        AnchorPane background_pane = new AnchorPane(background);
        root.getChildren().add(background_pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	
	public void setLabel(String label){
		
	}
	
	public String getLabel(){
	
	}
	
	public void setBackground(ImageView bg){
		
	}
	
	public void setDimensions(int length, int height){
		
	}
	
	public void setDimensionsMax (int length, int height){
	
	}
	
	
}
