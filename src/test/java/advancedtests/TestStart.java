package advancedtests;

import config.AdvancedConfig;
import org.testng.annotations.Test;
import pagesadvanced.DragScreen;

public class TestStart extends AdvancedConfig {

    @Test
    public void dragDownTest() {
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragDown();
    }

    @Test
    public void dragDownCountTest() {
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragDown(4);
    }
    @Test
    public void dragDownWindowTest() {
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragDownWindow();
    }
}
