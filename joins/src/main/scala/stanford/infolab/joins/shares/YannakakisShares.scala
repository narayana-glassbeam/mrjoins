package stanford.infolab.joins.shares

import stanford.infolab.joins.JoinsArguments

class YannakakisShares(joinsArgs: JoinsArguments) extends BaseShares(joinsArgs) {

  def performLocalJoin(arrBuf: Seq[(Byte, Long, Long)]): Seq[Array[Long]] = {
    null;
  }
}