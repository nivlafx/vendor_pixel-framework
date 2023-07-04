

package com.google.android.settings.biometrics.face;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.settings.R;
import com.android.settings.biometrics.face.FaceFeatureProvider;

public class FaceFeatureProviderGoogleImpl implements FaceFeatureProvider {
    public Intent getPostureGuidanceIntent(Context context) {
        ComponentName unflattenFromString;
        String string = context.getString(R.string.config_face_enroll_guidance_page);
        if (TextUtils.isEmpty(string) || (unflattenFromString = ComponentName.unflattenFromString(string)) == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setComponent(unflattenFromString);
        return intent;
    }

    public boolean isAttentionSupported(Context context) {
        return context.getResources().getBoolean(R.bool.config_face_settings_attention_supported);
    }

    public boolean isSetupWizardSupported(Context context) {
        return context.getResources().getBoolean(R.bool.config_suw_support_face_enroll);
    }
}
