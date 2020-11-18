package challenges;

public class Palladium2020CC {

    public int solution(int[] buildingsHeights) {
        int[] leftBannerAreas = calculateLeftBannerAreas(buildingsHeights);
        int[] rightBannerAreas = calculateRightBannerAreas(buildingsHeights);
        return findMinTotalAreaOfTwoBanners(leftBannerAreas, rightBannerAreas);
    }

    private int[] calculateLeftBannerAreas(int[] buildingsHeights) {
        int maxHeightEncountered = 0;
        int[] leftBannerAreas = new int[buildingsHeights.length];
        for (int i = 0; i < leftBannerAreas.length; i++) {
            maxHeightEncountered = Math.max(maxHeightEncountered, buildingsHeights[i]);
            int bannerWidth = i + 1;
            leftBannerAreas[i] = maxHeightEncountered * bannerWidth;
        }
        return leftBannerAreas;
    }

    private int[] calculateRightBannerAreas(int[] buildingsHeights) {
        int maxHeightEncountered = 0;
        int[] rightBannerAreas = new int[buildingsHeights.length];
        int lastBuildingIndex = rightBannerAreas.length - 1;
        for (int i = lastBuildingIndex - 1; i >= 0; i--) {
            maxHeightEncountered = Math.max(maxHeightEncountered, buildingsHeights[i + 1]);
            int bannerWidth = lastBuildingIndex - i;
            rightBannerAreas[i] = maxHeightEncountered * bannerWidth;
        }
        return rightBannerAreas;
    }

    private int findMinTotalAreaOfTwoBanners(int[] leftBannerAreas, int[] rightBannerAreas) {
        int minTotalAreaOfTwoBanners = Integer.MAX_VALUE;
        for (int i = 0; i < leftBannerAreas.length; i++) {
            int totalAreaOfTwoBanners = leftBannerAreas[i] + rightBannerAreas[i];
            minTotalAreaOfTwoBanners = Math.min(minTotalAreaOfTwoBanners, totalAreaOfTwoBanners);
        }
        return minTotalAreaOfTwoBanners;
    }
}
