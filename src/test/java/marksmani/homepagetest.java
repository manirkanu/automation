package marksmani;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class homepagetest {
	
	private static final boolean Size = false;
	homepageobject hp;
	Basepage bp;
	dressesobject ip;
	
	public homepagetest() {
		hp = new homepageobject();
		bp = new Basepage();
		ip = new dressesobject();
		
	}
	
	@Test 
	public void verifyTabNavigation() {
		hp.clickWomen();
		Assert.assertTrue(bp.getTitle().contains("Women"));
		hp.clickDresses();
		Assert.assertTrue(bp.getTitle().contains("Dresses"));
		hp.clickTshirts();
		Assert.assertTrue(bp.getTitle().contains("Tshirts"));

	}
	@Test
	  public void verifyTabNavigation1() {
		    hp.clickDresses();
		    Assert.assertTrue(bp.getTitle().contains("Dresses"));
		    ip.clickDresses();
			Assert.assertTrue(true);e("Size, S");
			ip.clickDresses();
			Assert.assertTrue(true);ip.("Size, M");
		    ip.clickDresses();
		    Assert.assertTrue(Size, "L");
	  }

		
	}
	  
	

}

