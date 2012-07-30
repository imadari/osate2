package fr.tpt.aadl.annex.behavior.utils;

import org.osate.aadl2.parsesupport.LocationReference ;

public class AadlBaLocationReference extends LocationReference
{
  private int _offset = -1 ;
  
  private int _length = -1 ;
  
  private int _column = -1 ;
  
  private String _id = "" ;

  public AadlBaLocationReference()
  {
    // fields are not set.
  }

  public AadlBaLocationReference(String fileName, int lineNumber)
  {
    super(fileName, lineNumber) ;
  }
  
  public AadlBaLocationReference(String fileName, int lineNumber, int offset,
                                  int length, int column, String id)
  {
    super(fileName, lineNumber) ;
    _offset = offset ;
    _length = length ;
    _column = column ;
    _id = id ;
  }
  
  // LocationReference's fields are not set.
  public AadlBaLocationReference(int offset,int length, int column, String id)
  {
    super() ;
    _offset = offset ;
    _length = length ;
    _column = column ;
    _id = id ;
  }
  
  public int getOffset()
  {
    return _offset ;
  }

  public int getLength()
  {
    return _length ;
  }

  public int getColumn()
  {
    return _column ;
  }
  
  public String getId()
  {
    return _id ;
  }

  @Override
  public AadlBaLocationReference clone()
  {
    
    
    AadlBaLocationReference clone = new 
                                  AadlBaLocationReference(this.getFilename(),
                                                          this.getLine(),
                                                          this.getOffset(),
                                                          this.getLength(),
                                                          this.getColumn(),
                                                          this.getId()) ;
                                                               
    return clone ;
  }
  
  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    
    sb.append("line: ") ;
    sb.append(this.getLine()) ;
    sb.append(", column:") ;
    sb.append(this.getColumn()) ;
    sb.append(", offset:") ;
    sb.append(this.getOffset()) ;
    
    return sb.toString() ;
  }
}
