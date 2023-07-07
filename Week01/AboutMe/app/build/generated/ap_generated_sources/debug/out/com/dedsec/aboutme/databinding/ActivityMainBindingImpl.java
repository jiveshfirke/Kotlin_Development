package com.dedsec.aboutme.databinding;
import com.dedsec.aboutme.R;
import com.dedsec.aboutme.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nickname_edit, 3);
        sViewsWithIds.put(R.id.done_button, 4);
        sViewsWithIds.put(R.id.bigyellowstar, 5);
        sViewsWithIds.put(R.id.scrollview, 6);
        sViewsWithIds.put(R.id.biotext, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.Button) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ScrollView) bindings[6]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nicknameView.setTag(null);
        this.textName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.myName == variableId) {
            setMyName((com.dedsec.aboutme.MyName) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMyName(@Nullable com.dedsec.aboutme.MyName MyName) {
        this.mMyName = MyName;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.myName);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.dedsec.aboutme.MyName myName = mMyName;
        java.lang.String myNameName = null;
        java.lang.String myNameNickname = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (myName != null) {
                    // read myName.name
                    myNameName = myName.getName();
                    // read myName.nickname
                    myNameNickname = myName.getNickname();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nicknameView, myNameNickname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textName, myNameName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): myName
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}