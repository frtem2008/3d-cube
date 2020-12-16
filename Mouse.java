import java.awt.event.*;

public class Mouse implements MouseListener, MouseMotionListener, MouseWheelListener {

    private int mouseX = 0;
    private int mouseY = 0;
    private int mouseB = 0;
    private int scroll = 0;

    public int getMouseX() {
        return this.mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }

    public boolean isScrollingUp() {
        return this.scroll == -1;
    }

    public boolean isScrollingDown() {
        return this.scroll == 1;
    }

    public void resetScroll() {
        this.scroll = 0;
    }

    public ClickTipe getButton() {
        switch (this.mouseB) {
            case 1:
                return ClickTipe.LeftClick;
            case 2:
                return ClickTipe.ScrollClick;
            case 3:
                return ClickTipe.RightClick;
            default:
                return ClickTipe.Unknown;
        }
    }

    public void resetButton() {
        this.mouseB = -1;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent event) {
        this.mouseB = event.getButton();
    }

    @Override
    public void mouseReleased(MouseEvent event) {
        this.mouseB = -1;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseDragged(MouseEvent event) {
        this.mouseX = event.getX();
        this.mouseY = event.getY();
    }

    @Override
    public void mouseMoved(MouseEvent event) {
        this.mouseX = event.getX();
        this.mouseY = event.getY();
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent event) {
        scroll = event.getWheelRotation();

    }
}
