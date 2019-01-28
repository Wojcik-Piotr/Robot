class Platform {
    private final int MAX_BLOCK_PILE = 15;
    private final int PLATFORM_LENGTH = 10;
    private int[] platform = new int[PLATFORM_LENGTH];

    boolean canLower(int position) {
        return platform[position] < MAX_BLOCK_PILE;
    }

    int getPLATFORM_LENGTH() {
        return PLATFORM_LENGTH;
    }

    String blocksOnPlatform() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < PLATFORM_LENGTH; i++) {
            output.append(platform[i]);
        }
        return output.toString();
    }

    void addBloc(int position) {
        platform[position]++;
    }
}
