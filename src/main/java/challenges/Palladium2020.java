package challenges;

public class Palladium2020 {

    public int solution(int[] H) {
        int minSize = Integer.MAX_VALUE;
        int[] leftBannerSizes = new int[H.length];
        int[] rightBannerSizes = new int[H.length];
        int maxLeftHeight = 0;
        int maxRightHeight = 0;
        for (int i = 0; i < leftBannerSizes.length; i++) {
            maxLeftHeight = Math.max(maxLeftHeight, H[i]);
            leftBannerSizes[i] = maxLeftHeight * (i + 1);
        }
        for (int i = 1; i < rightBannerSizes.length; i++) {
            maxRightHeight = Math.max(maxRightHeight, H[H.length - i]);
            rightBannerSizes[H.length - 1 - i] = maxRightHeight * i;
        }
        for (int i = 0; i < H.length; i++) {
            int size = leftBannerSizes[i] + rightBannerSizes[i];
            minSize = Math.min(minSize, size);
        }
        return minSize;
    }

}
