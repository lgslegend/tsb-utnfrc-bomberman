/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btGjkEpaSolver2 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btGjkEpaSolver2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btGjkEpaSolver2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btGjkEpaSolver2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static int StackSizeRequirement() {
    return gdxBulletJNI.btGjkEpaSolver2_StackSizeRequirement();
  }

  public static boolean Distance(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, SWIGTYPE_p_btGjkEpaSolver2__sResults results) {
    return gdxBulletJNI.btGjkEpaSolver2_Distance(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, SWIGTYPE_p_btGjkEpaSolver2__sResults.getCPtr(results));
  }

  public static boolean Penetration(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, SWIGTYPE_p_btGjkEpaSolver2__sResults results, boolean usemargins) {
    return gdxBulletJNI.btGjkEpaSolver2_Penetration__SWIG_0(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, SWIGTYPE_p_btGjkEpaSolver2__sResults.getCPtr(results), usemargins);
  }

  public static boolean Penetration(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, SWIGTYPE_p_btGjkEpaSolver2__sResults results) {
    return gdxBulletJNI.btGjkEpaSolver2_Penetration__SWIG_1(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, SWIGTYPE_p_btGjkEpaSolver2__sResults.getCPtr(results));
  }

  public static float SignedDistance(Vector3 position, float margin, btConvexShape shape, Matrix4 wtrs, SWIGTYPE_p_btGjkEpaSolver2__sResults results) {
    return gdxBulletJNI.btGjkEpaSolver2_SignedDistance__SWIG_0(position, margin, btConvexShape.getCPtr(shape), shape, wtrs, SWIGTYPE_p_btGjkEpaSolver2__sResults.getCPtr(results));
  }

  public static boolean SignedDistance(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, SWIGTYPE_p_btGjkEpaSolver2__sResults results) {
    return gdxBulletJNI.btGjkEpaSolver2_SignedDistance__SWIG_1(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, SWIGTYPE_p_btGjkEpaSolver2__sResults.getCPtr(results));
  }

  public btGjkEpaSolver2() {
    this(gdxBulletJNI.new_btGjkEpaSolver2(), true);
  }

}