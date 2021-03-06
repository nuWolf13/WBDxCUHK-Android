/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wbd101.hrvdemo;

public class AndroidRespirationAPIJNI {
  public final static native short respiration_result_t_respiratory_rate_get(long jarg1, respiration_result_t jarg1_);
  public final static native float respiration_result_t_respiration_current_depth_get(long jarg1, respiration_result_t jarg1_);
  public final static native boolean respiration_result_t_is_inspirating_get(long jarg1, respiration_result_t jarg1_);
  public final static native long new_respiration_result_t();
  public final static native void delete_respiration_result_t(long jarg1);
  public final static native void init_respiration_analysis();
  public final static native void analyze_respiration(float jarg1);
  public final static native long get_respiration_result();
  static {
    System.loadLibrary("HRV-lib");
  }
}
