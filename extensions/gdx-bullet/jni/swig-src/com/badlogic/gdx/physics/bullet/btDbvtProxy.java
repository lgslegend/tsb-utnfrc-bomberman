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

public class btDbvtProxy extends btBroadphaseProxy {
  private long swigCPtr;

  protected btDbvtProxy(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btDbvtProxy_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btDbvtProxy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btDbvtProxy(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setLeaf(btDbvtNode value) {
    gdxBulletJNI.btDbvtProxy_leaf_set(swigCPtr, this, btDbvtNode.getCPtr(value), value);
  }

  public btDbvtNode getLeaf() {
    long cPtr = gdxBulletJNI.btDbvtProxy_leaf_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btDbvtNode(cPtr, false);
  }

  public void setLinks(SWIGTYPE_p_p_btDbvtProxy value) {
    gdxBulletJNI.btDbvtProxy_links_set(swigCPtr, this, SWIGTYPE_p_p_btDbvtProxy.getCPtr(value));
  }

  public SWIGTYPE_p_p_btDbvtProxy getLinks() {
    long cPtr = gdxBulletJNI.btDbvtProxy_links_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_btDbvtProxy(cPtr, false);
  }

  public void setStage(int value) {
    gdxBulletJNI.btDbvtProxy_stage_set(swigCPtr, this, value);
  }

  public int getStage() {
    return gdxBulletJNI.btDbvtProxy_stage_get(swigCPtr, this);
  }

  public btDbvtProxy(Vector3 aabbMin, Vector3 aabbMax, SWIGTYPE_p_void userPtr, short collisionFilterGroup, short collisionFilterMask) {
    this(gdxBulletJNI.new_btDbvtProxy(aabbMin, aabbMax, SWIGTYPE_p_void.getCPtr(userPtr), collisionFilterGroup, collisionFilterMask), true);
  }

}