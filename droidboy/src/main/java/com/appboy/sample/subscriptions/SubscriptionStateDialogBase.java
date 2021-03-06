package com.appboy.sample.subscriptions;

import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;

import com.appboy.sample.R;
import com.appboy.support.AppboyLogger;

public abstract class SubscriptionStateDialogBase extends DialogPreference {
  private static final String TAG = AppboyLogger.getAppboyLogTag(SubscriptionStateDialogBase.class);
  protected static final int SUBSCRIBED_INDEX = 0;
  protected static final int OPTED_IN_INDEX = 1;
  protected static final int UNSUBSCRIBED_INDEX = 2;

  protected RadioGroup mSubscriptionState;

  public SubscriptionStateDialogBase(Context context, AttributeSet attrs) {
    super(context, attrs);
    setDialogLayoutResource(R.layout.subscription_state_preferences);
    setPersistent(false);
  }

  public SubscriptionStateDialogBase(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
    setDialogLayoutResource(R.layout.subscription_state_preferences);
    setPersistent(false);
  }

  @Override
  public View onCreateDialogView() {
    View view = super.onCreateDialogView();
    mSubscriptionState = view.findViewById(R.id.subscription_state);
    return view;
  }

  @Override
  protected void onBindDialogView(View view) {
    super.onBindDialogView(view);
  }

  @Override
  protected abstract void onDialogClosed(boolean positiveResult);
}
