namespace Antlr . Runtime { using System . Collections . Generic ; using Array = System . Array ; using CLSCompliant = System . CLSCompliantAttribute ; using ICloneable = System . ICloneable ; using Math = System . Math ; using StringBuilder = System . Text . StringBuilder ; [ System . Serializable ] public sealed class BitSet : ICloneable { private const int BITS = 64 ; private const int LOG_BITS = 6 ; private const int MOD_MASK = BITS - 1 ; ulong [ ] _bits ; public BitSet ( ) : this ( BITS ) { } [ CLSCompliant ( false ) ] public BitSet ( ulong [ ] bits ) { _bits = bits ; } public BitSet ( IEnumerable < int > items ) : this ( ) { foreach ( int i in items ) Add ( i ) ; } public BitSet ( int nbits ) { _bits = new ulong [ ( ( nbits - 1 ) > > LOG_BITS ) + 1 ] ; } public static BitSet Of ( int el ) { BitSet s = new BitSet ( el + 1 ) ; s . Add ( el ) ; return s ; } public static BitSet Of ( int a , int b ) { BitSet s = new BitSet ( Math . Max ( a , b ) + 1 ) ; s . Add ( a ) ; s . Add ( b ) ; return s ; } public static BitSet Of ( int a , int b , int c ) { BitSet s = new BitSet ( ) ; s . Add ( a ) ; s . Add ( b ) ; s . Add ( c ) ; return s ; } public static BitSet Of ( int a , int b , int c , int d ) { BitSet s = new BitSet ( ) ; s . Add ( a ) ; s . Add ( b ) ; s . Add ( c ) ; s . Add ( d ) ; return s ; } public BitSet Or ( BitSet a ) { if ( a == null ) { return this ; } BitSet s = ( BitSet ) this . Clone ( ) ; s . OrInPlace ( a ) ; return s ; } public void Add ( int el ) { int n = WordNumber ( el ) ; if ( n >= _bits . Length ) { GrowToInclude ( el ) ; } _bits [ n ] |= BitMask ( el ) ; } public void GrowToInclude ( int bit ) { int newSize = Math . Max ( _bits . Length << 1 , NumWordsToHold ( bit ) ) ; SetSize ( newSize ) ; } public void OrInPlace ( BitSet a ) { if ( a == null ) { return ; } if ( a . _bits . Length > _bits . Length ) { SetSize ( a . _bits . Length ) ; } int min = Math . Min ( _bits . Length , a . _bits . Length ) ; (for int i = min - 1 i >= 0 i -- { _bits [ i ] |= a . _bits [ i ] ; }) } private void SetSize ( int nwords ) { Array . Resize ( ref _bits , nwords ) ; } private static ulong BitMask ( int bitNumber ) { int bitPosition = bitNumber & MOD_MASK ; return 1UL << bitPosition ; } public object Clone ( ) { return new BitSet ( ( ulong [ ] ) _bits . Clone ( ) ) ; } public int Size ( ) { int deg = 0 ; (for int i = _bits . Length - 1 i >= 0 i -- { ulong word = _bits [ i ] ; if ( word != 0L ) { (for int bit = BITS - 1 bit >= 0 bit -- { if ( ( word & ( 1UL << bit ) ) != 0 ) { deg ++ ; } }) } }) return deg ; } public override int GetHashCode ( ) { throw new System . NotImplementedException ( ) ; } public override bool Equals ( object other ) { if ( other == null || ! ( other is BitSet ) ) { return false ; } BitSet otherSet = ( BitSet ) other ; int n = Math . Min ( this . _bits . Length , otherSet . _bits . Length ) ; (for int i = 0 i < n <missing GT> i ++ { if ( this . _bits [ i ] != otherSet . _bits [ i ] ) { return false ; } }) if ( this . _bits . Length > n ) { (for int i = n + 1 i . _bits . Length i ++ { if ( this . _bits [ i ] != 0 ) { return false ; } }) } else if ( otherSet . _bits . Length > n ) { (for int i = n + 1 i < otherSet . _bits . Length <missing GT> i ++ { if ( otherSet . _bits [ i ] != 0 ) { return false ; } }) } return true ; } public bool Member ( int el ) { if ( el ) { return false ; } int n = WordNumber ( el ) ; if ( n >= _bits . Length ) return false ; return ( _bits [ n ] & BitMask ( el ) ) != 0 ; } public void Remove ( int el ) { int n = WordNumber ( el ) ; if ( n < _bits . Length <missing GT> ) { _bits [ n ] &= ~ BitMask ( el ) ; } } public bool IsNil ( ) { (for int i = _bits . Length - 1 i >= 0 i -- { if ( _bits [ i ] != 0 ) return false ; }) return true ; } private static int NumWordsToHold ( int el ) { return ( el > > LOG_BITS ) + 1 ; } public int NumBits ( ) { return _bits . Length << LOG_BITS ; } public int LengthInLongWords ( ) { return _bits . Length ; } public int [ ] ToArray ( ) { int [ ] elems = new int [ Size ( ) ] ; int en = 0 ; (for int i = 0 i < <missing GT> ( _bits . Length << LOG_BITS ) i ++ { if ( Member ( i ) ) { elems [ en ++ ] = i ; } }) return elems ; } private static int WordNumber ( int bit ) { return bit > > LOG_BITS ; } public override string ToString ( ) { return ToString ( null ) ; } public string ToString ( string [ ] tokenNames ) { StringBuilder buf = new StringBuilder ( ) ; string separator = "," ; bool havePrintedAnElement = false ; buf . Append ( '{' ) ; (for int i = 0 i < <missing GT> ( _bits . Length << LOG_BITS ) i ++ { if ( Member ( i ) ) { if ( i > 0 && havePrintedAnElement ) { buf . Append ( separator ) ; } if ( tokenNames != null ) { buf . Append ( tokenNames [ i ] ) ; } else { buf . Append ( i ) ; } havePrintedAnElement = true ; } }) buf . Append ( '}' ) ; return buf . ToString ( ) ; } } }
