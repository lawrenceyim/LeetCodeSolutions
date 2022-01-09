class Solution {
    public boolean isRobotBounded(String instructions) {
        int[] position = new int[2];
        position[0] = position[1] = 0;
        String orientation = "North";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < instructions.length(); j++) {
                String next_instruction = Character.toString(instructions.charAt(j));
                if (next_instruction.equals("G")) {
                    position = move(position, next_instruction, orientation);
                } else {
                    orientation = change_orientation(orientation, next_instruction);
                }
            }
            if (position[0] == 0 && position[1] == 0) return true;
        }
        return false;
    }
    
    public static int[] move(int[] position, String instruction, String orientation) {
        if (orientation.equals("North")) {
            position[1] += 1;
        } else if (orientation.equals("South")) {
            position[1] -= 1;
        } else if (orientation.equals("West")) {
            position[0] -= 1;
        } else if (orientation.equals("East")) {
            position[0] += 1;
        }
        return position;
    }
    
    public static String change_orientation(String orientation, String instruction) {
        if (instruction.equals("L")) {
            if (orientation.equals("North")) {
                orientation = "West";
            } else if (orientation.equals("South")) {
                orientation = "East";
            } else if (orientation.equals("West")) {
                orientation = "South";
            } else if (orientation.equals("East")) {
                orientation = "North";
            }
        } else if (instruction.equals("R")) {
            if (orientation.equals("North")) {
                orientation = "East";
            } else if (orientation.equals("South")) {
                orientation = "West";
            } else if (orientation.equals("West")) {
               orientation = "North";
            } else if (orientation.equals("East")) {
                orientation = "South";
            }
        }
        return orientation;
    }
}