package gool.parser.csharp;
public interface CsharpNode {
  public Object accept(CsharpVisitor v);
}
