package com.ulbor.hosted.toast;

import org.junit.Test;
import com.ulbora.hosted.toast.HostedToast;
import static org.junit.Assert.assertEquals;
import android.test.AndroidTestCase;
import android.content.Context;
import android.test.mock.MockContext;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class HostedToastUnitTest{
    Context context;

    @Test
    public void showToast_test() throws Exception {
        HostedToast dev = new HostedToast(new android.test.mock.MockContext());
    }
}