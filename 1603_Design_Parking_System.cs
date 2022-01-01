public class ParkingSystem {
    int big_size, medium_size, small_size;
    int big = 0;
    int medium = 0;
    int small = 0;
    
    public ParkingSystem(int big, int medium, int small) {
        big_size = big;
        medium_size = medium;
        small_size = small;
    }
    
    public bool AddCar(int carType) {
        switch (carType) {
            case 1:
                if (big < big_size) {
                    big++;
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (medium < medium_size) {
                    medium++;
                    return true;
                } else {
                    return false;
                }
            default:                
                if (small < small_size) {
                    small++;
                    return true;
                } else {
                    return false;
                }
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * bool param_1 = obj.AddCar(carType);
 */