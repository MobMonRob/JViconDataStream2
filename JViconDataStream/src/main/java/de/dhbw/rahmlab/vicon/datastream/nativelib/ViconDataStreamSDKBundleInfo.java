package de.dhbw.rahmlab.vicon.datastream.nativelib;

import com.jogamp.common.os.DynamicLibraryBundle;
import com.jogamp.common.os.DynamicLibraryBundleInfo;
import com.jogamp.common.util.RunnableExecutor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViconDataStreamSDKBundleInfo implements DynamicLibraryBundleInfo {

    private static final List<String> glueLibNames;

    static {
        glueLibNames = new ArrayList<>();

        String[] glueLibNamesPrimitive = new String[]{
            //Wird automatisch als Abhängigkeit geladen?
            /*
            "libboost_atomic-mt.so.1.58.0",
            "libboost_chrono-mt.so.1.58.0",
            "libboost_container-mt.so.1.58.0",
            "libboost_context-mt.so.1.58.0",
            "libboost_coroutine-mt.so.1.58.0",
            "libboost_date_time-mt.so.1.58.0",
            "libboost_filesystem-mt.so.1.58.0",
            "libboost_graph-mt.so.1.58.0",
            "libboost_iostreams-mt.so.1.58.0",
            "libboost_locale-mt.so.1.58.0",
            "libboost_log-mt.so.1.58.0",
            "libboost_log_setup-mt.so.1.58.0",
            "libboost_math_c99f-mt.so.1.58.0",
            "libboost_math_c99l-mt.so.1.58.0",
            "libboost_math_c99-mt.so.1.58.0",
            "libboost_math_tr1f-mt.so.1.58.0",
            "libboost_math_tr1l-mt.so.1.58.0",
            "libboost_math_tr1-mt.so.1.58.0",
            "libboost_prg_exec_monitor-mt.so.1.58.0",
            "libboost_program_options-mt.so.1.58.0",
            "libboost_python-mt.so.1.58.0",
            "libboost_random-mt.so.1.58.0",
            "libboost_regex-mt.so.1.58.0",
            "libboost_serialization-mt.so.1.58.0",
            "libboost_signals-mt.so.1.58.0",
            "libboost_system-mt.so.1.58.0",
            "libboost_thread-mt.so.1.58.0",
            "libboost_timer-mt.so.1.58.0",
            "libboost_unit_test_framework-mt.so.1.58.0",
            "libboost_wave-mt.so.1.58.0",
            "libboost_wserialization-mt.so.1.58.0",
             */
            "ViconDataStreamSDK_CPP"
        //"ViconDataStreamSDK_C"
        };

        glueLibNames.addAll(Arrays.asList(glueLibNamesPrimitive));
    }

    protected ViconDataStreamSDKBundleInfo() {
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

    //Only the last entry is crucial, ie all other are optional preload dependencies and may generate errors, which are ignored.
    //GlueLibs sind die .so Dateien, die gesucht werden sollen.
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

    //ToolLibs sind Bibliotheken auf dem System, die für die zu ladenden Bibliotheken gebraucht werden.
    @Override
    public final List<List<String>> getToolLibNames() {
        final List<List<String>> libNamesList = new ArrayList<>();

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
