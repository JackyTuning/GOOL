package gool.parser.csharp2;
public interface CsharpNode {
  public Object accept(CsharpVisitor v);
}
