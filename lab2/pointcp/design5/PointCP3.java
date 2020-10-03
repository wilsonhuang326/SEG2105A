package design5;// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com
/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
 class PointCP3 extends PointCP5
{
    //Instance variables ************************************************

    /**
     * Contains C(artesian) or P(olar) to identify the type of
     * coordinates that are being dealt with.
     */
    private char typeCoord='C';

    /**
     * Contains the current value of X or RHO depending on the type
     * of coordinates.
     */
    private double xOrRho;

    /**
     * Contains the current value of Y or THETA value depending on the
     * type of coordinates.
     */
    private double yOrTheta;


    //Constructors ******************************************************

    /**
     * Constructs a coordinate object, with a type identifier.
     */
    public PointCP3(double xOrRho, double yOrTheta)
    {

        this.xOrRho = xOrRho;
        this.yOrTheta = yOrTheta;

    }


    //Instance methods **************************************************


    public double getX()
    {
        return xOrRho;
    }

    public double getY()
    {
        return yOrTheta;

    }

    public double getRho()
    {
        return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
    }

    public double getTheta()
    {
        return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
    }




    /**
     * Converts Cartesian coordinates to Polar coordinates.
     */
    public String convertStorageToPolar()
    {
        //Calculate X and Y
        double rho = getRho();
        double theta = getTheta();


        return "In form of Polar: [" + rho + "," + theta + "]\n";


    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString()
    {
        return "Stored as  Cartesian [" + getX() + "," + getY() + "]\n"+"In form of Polar: [" + getRho() + "," + getTheta()+ "]\n";

    }
}
