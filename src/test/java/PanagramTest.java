import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.testng.asserts.Assertion;


public class PanagramTest {

    @Test
    public void emptyIsNotAPanagram(){
        Assert.assertFalse(PanagramCheck.panagramCheck(""));
    }

    @Test
    public void alphabetIsPanagram(){
        Assert.assertTrue(PanagramCheck.panagramCheck("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void alphabetIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.panagramCheck("abcdefghijklmnopqrstuvwwwww"));
    }

    @Test
    public void alphabetCaseIsPanagram(){
        Assert.assertTrue(PanagramCheck.panagramCheck("AbcDefghIjKLmnOPqRSTUvwxyz"));
    }

    @Test
    public void alphabetCaseIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.panagramCheck("bcDefzghIjKALmRSTUvwxy"));
    }

    @Test
    public void alphabetPunctuatedIsPanagram(){
        Assert.assertTrue(PanagramCheck.panagramCheck("abcd;efgh,ijkl.mnop]qrst?uvw[xyz"));
    }

    @Test
    public void alphabetPunctuatedIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.panagramCheck("bd;efh,ijkl.mnp]qrst?uw[xyz"));
    }

    @Test
    public void alphabetFrequencyIsPanagram(){
        Assert.assertTrue(PanagramCheck.panagramCheck("aabbccddeeffgghhiijjkkllmnopqqrrrsttuvwxxyz"));
    }

    @Test
    public void alphabetFrequencyIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.panagramCheck("bbccddeeffgghhiijjkkllmnopqqrrrsttuvwxxyz"));
    }


    @Test
    public void alphabetMixedIsPanagram(){
        Assert.assertTrue(PanagramCheck.panagramCheck("obzdefhivajklmnwpqrsctuxgy"));
    }

    @Test
    public void alphabetMixedIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.panagramCheck("obzdefhivajkmnwpqrsctuxgy"));
    }

    @Test
    public void alphaNumericIsPanagram(){
        Assert.assertTrue(PanagramCheck.panagramCheck("32ab2c2defgh24i4jklmno44p5qrstu37vwxy23z"));
    }

    @Test
    public void alphaNumericIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.panagramCheck("32ab2c2def24i4jklo44p5qrstu37vy23z"));
    }

    @Test
    public void alphabetWithSpacesIsPanagram(){
        Assert.assertTrue(PanagramCheck.panagramCheck("a  b cd efg  hi jk l mno  pqr st u vw  x yz  "));
    }

    @Test
    public void alphabetWithSpacesIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.panagramCheck("  b cd efg  hi jk l mno  pqr st u vw  x yz  "));
    }


}
