package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        // Lets root access the CSS file, so that the program works! Not mentioned in the Slides!
        root.getStylesheets().add("sample/TransitionAnimations.css");  // <---- TOOK ME 3 HOURS TO FIGURE THIS OUT!!!!!!!!!

        primaryStage.setTitle("Transition Animations in Java FX!");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
        primaryStage.setResizable(false);

    }


    public static void main(String[] args) {
        launch(args);
    }


    //*************************************************
    // Console Reads:
    //*************************************************

    // May 23, 2019 7:01:47 AM com.sun.javafx.css.StyleManager loadStylesheetUnPrivileged
    // WARNING: Resource "TransitionAnimations.css" not found.

    // It still gives the WARNING, even though the CSS files was found, because
    // The rectangle no longer appears to be black, it now appears Red and Yellow!
    // So Why am I still getting the warning even though everything works?

    // Another weird run-time notice?:

    // 2019-05-23 07:07:13.043 java[88247:4253782] -[NSPersistentUIWindowSnapshotter writeWindowSnapshot:length:width:height:bytesPerRow:toFile:inDirectory:encryptingWithKey:uuid:checksum:fd:]: 0 == ftruncate(fd, finalFileSize) failed on line 797: No such file or directory
    // 2019-05-23 07:07:13.044 java[88247:4253782] -[NSPersistentUIWindowSnapshotter writeWindowSnapshot:length:width:height:bytesPerRow:toFile:inDirectory:encryptingWithKey:uuid:checksum:fd:]: 0 == ftruncate(fd, fileLength) failed on line 868: No such file or directory

    // Apparently resizing the window to (v: 400, v1: 400) fixed the run time notices???  (o_O) I'm lost????


    // Process finished with exit code 0


    //**********************************************************
    // My Thoughts on things I want to improve, but can't:
    //**********************************************************

    // Rectangle is over-lapping with the Button, but when I check the FXML file in Scene Builder it looks normal, So I'm not sure what to really do
    // or How to even fix this at all if it can even be fixed?
    // Also maybe it's just me, But Auto-reverse seems to be broken. Sometimes the rectangle will remain in a angled position 270 degrees, etc, and when
    // The sequential animation ends it remains slanted/angled in that position, and if I press the Start Animations Button again it will do all the animations
    // again, BUT it starts with the same crooked angled position. So the remaining animation sequence is different from the one before! I'm not sure if this is
    // a minor bug, or a cool feature!   :D
    // The bug is more likely to show up if you click the button multiple times.
    // This also applies to the size it doesn't return to the original size and plays the sequential animation in the larger size?

    // UPDATE:
    // All of the bugs were fixed when I went into SceneBuilder and set The Rectangle's id to "Rectangle", then I made sure the CSS file was working with the "Rectangle" id.

}
