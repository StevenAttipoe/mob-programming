import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PanagramTest {

    @Test
    public void emptyIsNotAPanagram(){
        Assertions.assertFalse(PanagramCheck.isPanagram(""));
    }

    @Test
    public void alphabetIsPanagram(){
        Assertions.assertTrue(PanagramCheck.isPanagram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void alphabetIsNotPanagram(){
        Assertions.assertFalse(PanagramCheck.isPanagram("abcdefghijklmnopqrstuvwwwww"));
    }

    @Test
    public void alphabetCaseIsPanagram(){
        Assertions.assertTrue(PanagramCheck.isPanagram("AbcDefghIjKLmnOPqRSTUvwxyz"));
    }

    @Test
    public void alphabetCaseIsNotPanagram(){
        Assertions.assertFalse(PanagramCheck.isPanagram("bcDefzghIjKALmRSTUvwxy"));
    }

    @Test
    public void alphabetPunctuatedIsPanagram(){
        Assertions.assertTrue(PanagramCheck.isPanagram("abcd;efgh,ijkl.mnop]qrst?uvw[xyz"));
    }

    @Test
    public void alphabetPunctuatedIsNotPanagram(){
        Assertions.assertFalse(PanagramCheck.isPanagram("bd;efh,ijkl.mnp]qrst?uw[xyz"));
    }

    @Test
    public void alphabetFrequencyIsPanagram(){
        Assertions.assertTrue(PanagramCheck.isPanagram("aabbccddeeffgghhiijjkkllmnopqqrrrsttuvwxxyz"));
    }

    @Test
    public void alphabetFrequencyIsNotPanagram(){
        Assertions.assertFalse(PanagramCheck.isPanagram("bbccddeeffgghhiijjkkllmnopqqrrrsttuvwxxyz"));
    }


    @Test
    public void alphabetMixedIsPanagram(){
        Assertions.assertTrue(PanagramCheck.isPanagram("obzdefhivajklmnwpqrsctuxgy"));
    }

    @Test
    public void alphabetMixedIsNotPanagram(){
        Assertions.assertFalse(PanagramCheck.isPanagram("obzdefhivajkmnwpqrsctuxgy"));
    }

    @Test
    public void alphaNumericIsPanagram(){
        Assertions.assertTrue(PanagramCheck.isPanagram("32ab2c2defgh24i4jklmno44p5qrstu37vwxy23z"));
    }

    @Test
    public void alphaNumericIsNotPanagram(){
        Assertions.assertFalse(PanagramCheck.isPanagram("32ab2c2def24i4jklo44p5qrstu37vy23z"));
    }

    @Test
    public void alphabetWithSpacesIsPanagram(){
        Assertions.assertTrue(PanagramCheck.isPanagram("a  b cd efg  hi jk l mno  pqr st u vw  x yz  "));
    }

    @Test
    public void alphabetWithSpacesIsNotPanagram(){
        Assertions.assertFalse(PanagramCheck.isPanagram("  b cd efg  hi jk l mno  pqr st u vw  x yz  "));
    }


}
