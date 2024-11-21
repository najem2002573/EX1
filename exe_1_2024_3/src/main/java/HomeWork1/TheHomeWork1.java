package HomeWork1;
/*The home work 1 is solved by the students:
1-  נגים אלדין זועבי 324887983
2-  אחמד זועבי 213027667
*/
public class TheHomeWork1 {
	public static double compareNumbers(double A, double B, String mode) {
        switch (mode.toLowerCase()) {
            case "regular":
                // Regular comparison: return the larger of A and B
                return Math.max(A, B);

            case "opposite":
                // Opposite comparison: compare the negatives of A and B
                return (-A > -B) ? A : B;

            case "inverse":
                // Inverse comparison: compare the reciprocals of A and B
                // Ensure neither A nor B is zero to avoid division by zero
                if (A == 0 || B == 0) {
                    throw new IllegalArgumentException("Inputs cannot be zero for inverse comparison.");
                }
                return (1 / A > 1 / B) ? A : B;

            default:
                throw new IllegalArgumentException("Invalid mode. Supported modes: regular, opposite, inverse.");
        }
	}
}
