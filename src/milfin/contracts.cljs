(ns milfin.contracts)

(def chain->contracts
  {:matic {:milzap {:abistr #js["function zapInToken(address _from, uint amount, address _to, address routerAddr, address _recipient) external"
                                "function zapIn(address _to, address routerAddr, address _recipient) external payable"
                                "function zapInToLPVault(address _to, address routerAddr, address _vault, address _recipient) external payable"
                                "function zapInToSingleSidedVault(address _to, address routerAddr, address _vault, address _recipient) external payable"
                                "function zapInTokenToLPVault(address _from, uint amount, address _to, address routerAddr, address _vault, address _recipient) external"
                                "function zapInTokenToSingleSideVault(address _from, uint amount, address _to, address routerAddr, address _vault, address _recipient) external"
                                "function zapAcross(address _from, uint amount, address _toRouter, address _recipient) external"
                                "function zapOut(address _from, uint amount, address routerAddr, address _recipient) external"
                                "function zapOutToken(address _from, uint amount, address _to, address routerAddr, address _recipient) external"]

                    :addr "0x17A32a805779feC6A0b3eBab6Cb60fc190Ae899B"
                    :name "LP Zapper"
                    :chain :matic
                    :type :milzap}}
   :ftm {:milzap {:abistr  #js["function zapInToken(address _from, uint amount, address _to, address routerAddr, address _recipient) external"
                               "function zapIn(address _to, address routerAddr, address _recipient) external payable"
                               "function zapInToLPVault(address _to, address routerAddr, address _vault, address _recipient) external payable"
                               "function zapInToSingleSidedVault(address _to, address routerAddr, address _vault, address _recipient) external payable"
                               "function zapInTokenToLPVault(address _from, uint amount, address _to, address routerAddr, address _vault, address _recipient) external"
                               "function zapInTokenToSingleSideVault(address _from, uint amount, address _to, address routerAddr, address _vault, address _recipient) external"
                               "function zapAcross(address _from, uint amount, address _toRouter, address _recipient) external"
                               "function zapOut(address _from, uint amount, address routerAddr, address _recipient) external"
                               "function zapOutToken(address _from, uint amount, address _to, address routerAddr, address _recipient) external"]

                  :addr "0x1B4BD984AA35F2a42efb5c85a8762b83f525F545"
                  :name "LP Zapper"
                  :chain :ftm
                  :type :milzap}}
   :utils {:erc20
           {:abistr #js["function balanceOf(address owner) view returns (uint)",
                        "function transfer(address to, uint amount)",
                        "function transferFrom(address from, address to, uint amount)",
                        "function approve(address spender, uint amount)"
                        "function allowance(address owner, address spender) external view returns (uint)"]
            :type :utility
            :name "ERC20"}}})
