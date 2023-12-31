class TrappingRainWater {
    public static void trap(int[] pillars) {

        if (pillars.length == 0) {
            System.out.println("No Pillar Exist , so can't store any Water....");
            // return 0;
        }
        // Left Max Pillar (Prefix Max)
        int leftPillarMax[] = new int[pillars.length];
        leftPillarMax[0] = pillars[0];
        for (int i = 1; i < pillars.length; i++) {
            leftPillarMax[i] = Math.max(leftPillarMax[i - 1], pillars[i]);
        }
        System.out.println("Left Pillar Max");
        for (int i : leftPillarMax) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Right Max Pillar (Suffix Max)
        int rightPillarMax[] = new int[pillars.length];
        rightPillarMax[rightPillarMax.length - 1] = pillars[pillars.length - 1];
        for (int i = rightPillarMax.length - 2; i >= 0; i--) {
            rightPillarMax[i] = Math.max(rightPillarMax[i + 1], pillars[i]);
        }
        System.out.println("Right Pillar Max");
        for (int i : rightPillarMax) {
            System.out.print(i + " ");
        }
        System.out.println();
        int amountOfWater = 0;
        for (int i = 0; i < pillars.length; i++) {
            int currentPillar = pillars[i];
            int decideHeight = Math.min(leftPillarMax[i], rightPillarMax[i]);
            // if (decideHeight > currentPillar) {
            amountOfWater += decideHeight - currentPillar;
            // }

        }
        // return amountOfWater;
        System.out.println(amountOfWater);

    }

    public static void main(String[] args) {
        int pillars[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println("Initial array");
        for (int i : pillars) {
            System.out.print(i + " ");
        }
        System.out.println();

        trap(pillars);

    }
}