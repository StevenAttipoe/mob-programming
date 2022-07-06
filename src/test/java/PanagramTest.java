import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class PanagramTest {

    @Test
    public void emptyIsNotAPanagram(){
        Assert.assertFalse(PanagramCheck.isPanagram(""));
    }

    @Test
    public void alphabetIsPanagram(){
        Assert.assertTrue(PanagramCheck.isPanagram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void alphabetIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.isPanagram("abcdefghijklmnopqrstuvwwwww"));
    }

    @Test
    public void alphabetCaseIsPanagram(){
        Assert.assertTrue(PanagramCheck.isPanagram("AbcDefghIjKLmnOPqRSTUvwxyz"));
    }

    @Test
    public void alphabetCaseIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.isPanagram("bcDefzghIjKALmRSTUvwxy"));
    }

    @Test
    public void alphabetPunctuatedIsPanagram(){
        Assert.assertTrue(PanagramCheck.isPanagram("abcd;efgh,ijkl.mnop]qrst?uvw[xyz"));
    }

    @Test
    public void alphabetPunctuatedIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.isPanagram("bd;efh,ijkl.mnp]qrst?uw[xyz"));
    }

    @Test
    public void alphabetFrequencyIsPanagram(){
        Assert.assertTrue(PanagramCheck.isPanagram("aabbccddeeffgghhiijjkkllmnopqqrrrsttuvwxxyz"));
    }

    @Test
    public void alphabetFrequencyIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.isPanagram("bbccddeeffgghhiijjkkllmnopqqrrrsttuvwxxyz"));
    }


    @Test
    public void alphabetMixedIsPanagram(){
        Assert.assertTrue(PanagramCheck.isPanagram("obzdefhivajklmnwpqrsctuxgy"));
    }

    @Test
    public void alphabetMixedIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.isPanagram("obzdefhivajkmnwpqrsctuxgy"));
    }

    @Test
    public void alphaNumericIsPanagram(){
        Assert.assertTrue(PanagramCheck.isPanagram("32ab2c2defgh24i4jklmno44p5qrstu37vwxy23z"));
    }

    @Test
    public void alphaNumericIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.isPanagram("32ab2c2def24i4jklo44p5qrstu37vy23z"));
    }

    @Test
    public void alphabetWithSpacesIsPanagram(){
        Assert.assertTrue(PanagramCheck.isPanagram("a  b cd efg  hi jk l mno  pqr st u vw  x yz  "));
    }

    @Test
    public void alphabetWithSpacesIsNotPanagram(){
        Assert.assertFalse(PanagramCheck.isPanagram("  b cd efg  hi jk l mno  pqr st u vw  x yz  "));
    }


}
