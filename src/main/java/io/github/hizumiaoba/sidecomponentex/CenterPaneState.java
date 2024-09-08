package io.github.hizumiaoba.sidecomponentex;

enum CenterPaneState {
  HOME("fxml/home.fxml", null),
  PAGE1("fxml/page1.fxml", null),
  PAGE2("fxml/page2.fxml", null),
  PAGE3("fxml/page3.fxml", null);

  private final String fxmlPath;
  private final String cssPath;

  CenterPaneState(String fxmlPath, String cssPath) {
    this.fxmlPath = fxmlPath;
    this.cssPath = cssPath;
  }

  public String getFxmlPath() {
    return this.fxmlPath;
  }

  public String getCssPath() {
    return this.cssPath;
  }
}
