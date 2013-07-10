/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;

public class btIndexedMesh {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btIndexedMesh(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btIndexedMesh obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btIndexedMesh(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

	/** Construct a new btIndexedMesh based on the supplied {@link Mesh}
	 * The specified mesh must be indexed and triangulated and must outlive this btIndexedMesh.
	 * The buffers for the vertices and indices are shared amonst both. */
	public btIndexedMesh(final Mesh mesh) {
		this();
		set(mesh);
	}
	
	/** Convenience method to set this btIndexedMesh to the specified {@link Mesh} 
	 * The specified mesh must be indexed and triangulated and must outlive this btIndexedMesh.
	 * The buffers for the vertices and indices are shared amonst both. */
	public void set(final Mesh mesh) {
		final int numIndices = mesh.getNumIndices();
		if ((numIndices <= 0) || ((numIndices % 3) != 0))
			throw new com.badlogic.gdx.utils.GdxRuntimeException("Mesh must be indexed and triangulated");
		java.nio.FloatBuffer buf = mesh.getVerticesBuffer();
		VertexAttribute posAttr = mesh.getVertexAttribute(Usage.Position);
		if (posAttr == null)
			throw new com.badlogic.gdx.utils.GdxRuntimeException("Mesh doesn't have a position attribute");
		final int pos = buf.position();
		buf.position(posAttr.offset);
		setM_indexType(PHY_ScalarType.PHY_SHORT);
		setM_numTriangles(numIndices/3);
		setM_numVertices(mesh.getNumVertices());
		setM_triangleIndexStride(6);
		setM_vertexStride(mesh.getVertexSize());
		setM_vertexType(PHY_ScalarType.PHY_FLOAT);
		setTriangleIndexBase(mesh.getIndicesBuffer());
		setVertexBase(buf);
		buf.position(pos);
	}

  public void setM_numTriangles(int value) {
    gdxBulletJNI.btIndexedMesh_m_numTriangles_set(swigCPtr, this, value);
  }

  public int getM_numTriangles() {
    return gdxBulletJNI.btIndexedMesh_m_numTriangles_get(swigCPtr, this);
  }

  public void setM_triangleIndexBase(java.nio.ByteBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      gdxBulletJNI.btIndexedMesh_m_triangleIndexBase_set(swigCPtr, this, value);
    }
  }

  public java.nio.ByteBuffer getM_triangleIndexBase() {
    return gdxBulletJNI.btIndexedMesh_m_triangleIndexBase_get(swigCPtr, this);
}

  public void setM_triangleIndexStride(int value) {
    gdxBulletJNI.btIndexedMesh_m_triangleIndexStride_set(swigCPtr, this, value);
  }

  public int getM_triangleIndexStride() {
    return gdxBulletJNI.btIndexedMesh_m_triangleIndexStride_get(swigCPtr, this);
  }

  public void setM_numVertices(int value) {
    gdxBulletJNI.btIndexedMesh_m_numVertices_set(swigCPtr, this, value);
  }

  public int getM_numVertices() {
    return gdxBulletJNI.btIndexedMesh_m_numVertices_get(swigCPtr, this);
  }

  public void setM_vertexBase(java.nio.ByteBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      gdxBulletJNI.btIndexedMesh_m_vertexBase_set(swigCPtr, this, value);
    }
  }

  public java.nio.ByteBuffer getM_vertexBase() {
    return gdxBulletJNI.btIndexedMesh_m_vertexBase_get(swigCPtr, this);
}

  public void setM_vertexStride(int value) {
    gdxBulletJNI.btIndexedMesh_m_vertexStride_set(swigCPtr, this, value);
  }

  public int getM_vertexStride() {
    return gdxBulletJNI.btIndexedMesh_m_vertexStride_get(swigCPtr, this);
  }

  public void setM_indexType(int value) {
    gdxBulletJNI.btIndexedMesh_m_indexType_set(swigCPtr, this, value);
  }

  public int getM_indexType() {
    return gdxBulletJNI.btIndexedMesh_m_indexType_get(swigCPtr, this);
  }

  public void setM_vertexType(int value) {
    gdxBulletJNI.btIndexedMesh_m_vertexType_set(swigCPtr, this, value);
  }

  public int getM_vertexType() {
    return gdxBulletJNI.btIndexedMesh_m_vertexType_get(swigCPtr, this);
  }

  public btIndexedMesh() {
    this(gdxBulletJNI.new_btIndexedMesh(), true);
  }

  public void setTriangleIndexBase(java.nio.ShortBuffer data) {
    assert data.isDirect() : "Buffer must be allocated direct.";
    {
      gdxBulletJNI.btIndexedMesh_setTriangleIndexBase(swigCPtr, this, data);
    }
  }

  public void setVertexBase(java.nio.FloatBuffer data) {
    assert data.isDirect() : "Buffer must be allocated direct.";
    {
      gdxBulletJNI.btIndexedMesh_setVertexBase(swigCPtr, this, data);
    }
  }

}