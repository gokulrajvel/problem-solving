class Qcube extends Shape3D {
    void calculateVolume(int val) {
        System.out.println(val * val * val);
    }

    void calculateSurfaceArea(int val) {
        System.out.println(((double) 4 / 3) * 3.14 * (val * val));
    }
}
