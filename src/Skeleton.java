public class Skeleton extends Boss {
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public String printInfo() {
        String info = super.printInfo();
        info += "Arrows: " + getArrows() + "\n";
        return info;
    }
}



