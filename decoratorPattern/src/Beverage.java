public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI}
    // 기본 사이즈
    Size size = Size.TALL;
    String description = "제목없음";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }
}
