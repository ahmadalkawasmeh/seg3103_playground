import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{

  private int year;
  private int month;
  private int day;

  public DateNextDateExceptionTest(int year, int month, int day)
  {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  @Parameters
  public static List<Integer[]> data( )
  {
    List<Integer[]> params = new LinkedList<Integer[]>( );
    params.add(new Integer[] { 1500, 02, 31 });
    params.add(new Integer[] { 1500, 02, 29 });
    params.add(new Integer[] { -1, 10, 20 });
    params.add(new Integer[] { 1458, 15, 12 });
    params.add(new Integer[] { 1975, 6, -50 });
    params.add(new Integer[] { 1975, 3, 32 });
    params.add(new Integer[] { 1975, 9, 34 });
    params.add(new Integer[] { 1600, 2, 30 });
    params.add(new Integer[] { 1975, -2, 21 });
    params.add(new Integer[] { 1975, 21, 15 });
    params.add(new Integer[] { 1975, 6, 31 });
    params.add(new Integer[] { 1975, 4, 31 });
    params.add(new Integer[] { 1975, 9, 31 });
    params.add(new Integer[] { 1975, 11, 31 });
    params.add(new Integer[] { 1601, 2, 29 });
    params.add(new Integer[] { 2003, 2, 30});



    return params;
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNextDate()
  {
    new Date(year, month, day);
  }

}
