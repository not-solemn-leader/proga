public class Door extends BaseObject{
    boolean isOpen;
    Places from, to;
    public Door(Places from, Places to, boolean isOpen){
        this.from = from;
        this.to = to;
        this.isOpen = isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}
