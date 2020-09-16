package de.dhbw.rahmlab.vicon.datastream.nativelib;

import com.jogamp.common.os.DynamicLibraryBundle;
import com.jogamp.common.os.DynamicLibraryBundleInfo;
import com.jogamp.common.util.RunnableExecutor;
import java.util.ArrayList;
import java.util.List;

public class JViconDataStreamBundleInfo implements DynamicLibraryBundleInfo {

    private static final List<String> glueLibNames;

    static {
        glueLibNames = new ArrayList<>();
        glueLibNames.add("jViconDataStreamSDK");
    }

    protected JViconDataStreamBundleInfo() {
    }

    /**
     * <p>
     * Returns <code>true</code>, since we might load the library and allow
     * symbol access to subsequent libs.
     * </p>
     */
    @Override
    public final boolean shallLinkGlobal() {
        return true;
    }

    /**
     * {@inheritDoc}
     * <p>
     * Returns <code>false</code>.
     * </p>
     */
    @Override
    public final boolean shallLookupGlobal() {
        return false;
    }

    @Override
    public final List<String> getGlueLibNames() {
        return glueLibNames;
    }

    @Override
    public final boolean searchToolLibInSystemPath() {
        return true;
    }

    @Override
    public final boolean searchToolLibSystemPathFirst() {
        return true;
    }

    @Override
    public final List<List<String>> getToolLibNames() {
        final List<List<String>> libNamesList = new ArrayList<>();

        /*
        final List<String> libNames = new ArrayList<String>();
        {
                // this is the default AL lib name, according to the spec
                // libNames.add("libtest1.so"); // unix
                libNames.add("jViconDataStreamSDK"); // windows, OSX
        }
        libNamesList.add(libNames);
         */
        libNamesList.add(glueLibNames);

        return libNamesList;
    }

    @Override
    public final List<String> getToolGetProcAddressFuncNameList() {
            return null;
    }

    @Override
    public final long toolGetProcAddress(final long toolGetProcAddressHandle, final String funcName) {
       return 0;
    }

    @Override
    public final boolean useToolGetProcAdressFirst(final String funcName) {
        return false;
    }

    @Override
    public final RunnableExecutor getLibLoaderExecutor() {
        return DynamicLibraryBundle.getDefaultRunnableExecutor();
    }
}
