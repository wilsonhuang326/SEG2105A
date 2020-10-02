package design2;// This file contains material supporting section 2.9 of the textbook:
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
public class PointCP2
{
    //Instance variables ************************************************

    /**
     * Contains C(artesian) or P(olar) to identify the type of
     * coordinates that are being dealt with.
     */
    private char typeCoord='P';

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
    public PointCP2(double xOrRho, double yOrTheta)
    {

        this.xOrRho = xOrRho;
        this.yOrTheta = yOrTheta;

    }


    //Instance methods **************************************************


    public double getX()
    {
            return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
    }

    public double getY()
    {
            return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
    }

    public double getRho()
    {
            return xOrRho;

    }

    public double getTheta()
    {
            return yOrTheta;

    }




    /**
     * Converts Polar coordinates to Cartesian coordinates.
     */
    public String convertStorageToCartesian()
    {
            //Calculate X and Y
            double x = getX();
            double y = getY();

            return "In form of Cartesian: [" + x + "," + y + "]\n";


    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString()
    {
        return "Stored as  Polar [" + getRho() + "," + getTheta() + "]\n";

    }
}
