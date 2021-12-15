class ParkingSystem {
     int big, medium, small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                return (big > 0) ? (--big >= 0) : false;
            case 2:
                return (medium > 0) ? (--medium >= 0) : false;
            case 3:
                return (small > 0) ? (--small >= 0) : false;
            default:
                return false;
        }
    }
}
