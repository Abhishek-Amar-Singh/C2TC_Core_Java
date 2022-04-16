package pkgLambdaExpression;

interface CameraInterface
{
	void setResolution(String wxhPixels);
	String getResolution();
}

interface CameraInterfaceForLambda
{
	void resolution(String wxhPixels);
}

public class CameraInterfaceMain
{
	public static void main(String[] args)
	{
		CameraInterface cameraInterface = new CameraInterface() {
			private String wxhPixels;

			@Override
			public void setResolution(String wxhPixels) {
				this.wxhPixels = wxhPixels;
			}

			@Override
			public String getResolution() {
				return this.wxhPixels;
			}
		};
		cameraInterface.setResolution("1280 x 1024");
		System.out.println("Pixels: " + cameraInterface.getResolution());
		
		CameraInterfaceForLambda lambdaCameraInterface = s -> System.out.println("Pixels: " + s);
		lambdaCameraInterface.resolution("2048 x 1536");
	}
}