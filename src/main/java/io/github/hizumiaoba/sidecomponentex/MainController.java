package io.github.hizumiaoba.sidecomponentex;

import com.google.common.base.Strings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class MainController {

  @FXML
  private StackPane centerPane;

  private volatile CenterPaneState currentCenterPaneState;

  @FXML
  private void initialize() {
    setCenterPane(CenterPaneState.HOME);
  }

  @FXML
  private void onHomeButtonClick(ActionEvent e) {
    setCenterPane(CenterPaneState.HOME);
  }

  @FXML
  private void onPage1ButtonClick(ActionEvent e) {
    setCenterPane(CenterPaneState.PAGE1);
  }

  @FXML
  private void onPage2ButtonClick(ActionEvent e) {
    setCenterPane(CenterPaneState.PAGE2);
  }

  @FXML
  private void onPage3ButtonClick(ActionEvent e) {
    setCenterPane(CenterPaneState.PAGE3);
  }

  private void setCenterPane(CenterPaneState next) {
    if(this.currentCenterPaneState == next) {
      return;
    }
    this.currentCenterPaneState = next;
    this.centerPane.getChildren().clear();
    try {
      FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource(next.getFxmlPath()));
      AnchorPane scene = fxmlLoader.load();
      if(!Strings.isNullOrEmpty(next.getCssPath())) {
        scene.getStylesheets().add(MainApplication.class.getResource(next.getCssPath()).toExternalForm());
      }
      this.centerPane.getChildren().add(scene);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

}