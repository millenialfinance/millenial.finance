(ns milfin.vaults)

(def ftm-vaults
  {"0x49b5988d48039794f6232b44D7ed8F9bF8b6F784" {:name "SPIRIT/FTM Supra Finance Vault"
                                                 :token "0x30748322b6e34545dbe0788c421886aeb5297789"
                                                 :router "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
                                                 :address "0x49b5988d48039794f6232b44D7ed8F9bF8b6F784"}
   "0x1ca699086cb76235fb7fe8db85b21834a24d08cd" {:name "wETH/FTM Spirit LP Supra Finance Vault"
                                                 :token "0x613bf4e46b4817015c01c6bb31c7ae9edaadc26e"
                                                 :router "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
                                                 :address "0x1ca699086cb76235fb7fe8db85b21834a24d08cd"}
   "0x8a764562aa6e2cb35e432e8dd7865a830e4d5385" {:name "wBTC/FTM Spirit LP Supra Finance Vault"
                                                 :token "0x279b2c897737a50405ED2091694F225D83F2D3bA"
                                                 :router "0x16327e3fbdaca3bcf7e38f5af2599d2ddc33ae52"
                                                 :address "0x8a764562aa6e2cb35e432e8dd7865a830e4d5385"}
   "0x53657c229E3bC75E0D3F412623F157689019E3Fb" {:name "BOO/FTM Supra Finance Vault"
                                                 :token "0xEc7178F4C41f346b2721907F5cF7628E388A7a58"
                                                 :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 :address "0x53657c229E3bC75E0D3F412623F157689019E3Fb"}
   "0xEe3a7c885Fd3cc5358FF583F2DAB3b8bC473316f" {:name "BOO/FTM Beefy Finance Vault"
                                                 :token "0xEc7178F4C41f346b2721907F5cF7628E388A7a58"
                                                 :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 :address "0xEe3a7c885Fd3cc5358FF583F2DAB3b8bC473316f"}
   "0x2fCcaF5CE4B8E9636AFA575523d69FC40E083eB3" {:name "ICE/FTM Supra Finance Vault"
                                                 :token "0x84311ecc54d7553378c067282940b0fdfb913675"
                                                 :router "0x1b02dA8Cb0d097eB8D57A175b88c7D8b47997506"
                                                 :address "0x2fCcaF5CE4B8E9636AFA575523d69FC40E083eB3"}
   "0x41D44B276904561Ac51855159516FD4cB2c90968" {:name "FTM/USDC Beefy Finance Vault"
                                                 :token "0x2b4c76d0dc16be1c31d4c1dc53bf9b45987fc75c"
                                                 :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 :address "0x41D44B276904561Ac51855159516FD4cB2c90968"}
   "0xdf68Bf80D427A5827Ff2c06A9c70D407e17DC041" {:name "CRV/FTM Beefy Finance Vault"
                                                 :token "0xb471ac6ef617e952b84c6a9ff5de65a9da96c93b"
                                                 :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 :address "0xdf68Bf80D427A5827Ff2c06A9c70D407e17DC041"}
   "0xDa4bb93Bac7CC00F6c6e2193d115Cf45099b31a0" {:name "AAVE/FTM Beefy Finance Vault"
                                                 :token "0xebf374bb21d83cf010cc7363918776adf6ff2bf6"
                                                 :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 :address "0xDa4bb93Bac7CC00F6c6e2193d115Cf45099b31a0"}
   "0x2a30C5e0d577108F694d2A96179cd73611Ee069b" {:name "wETH/FTM Beefy Finance Vault"
                                                 :token "0xf0702249f4d3a25cd3ded7859a165693685ab577"
                                                 :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 :address "0x2a30C5e0d577108F694d2A96179cd73611Ee069b"}
   "0xA3e3Af161943CfB3941B631676134bb048739727" {:name "BTC/FTM Beefy Finance Vault"
                                                 :token "0xfdb9ab8b9513ad9e419cf19530fee49d412c3ee3"
                                                 :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 :address "0xA3e3Af161943CfB3941B631676134bb048739727"}
   "0x5d89017d2465115007AbA00da1E6446dF2C19f34"  {:name "USDT/FTM Beefy Finance Vault"
                                                  :token "0x5965e53aa80a0bcf1cd6dbdd72e6a9b2aa047410"
                                                  :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                  :address "0x5d89017d2465115007AbA00da1E6446dF2C19f34"}
   "0x2dC73D17Ae01De6D49aab45668601591FF283dee" {:name "YFI/FTM Beefy Finance Vault"
                                                 :token "0xbf4d61d4cec3a9dff7452d8987e1cc2943e2eb4c"
                                                 :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 :address "0x2dC73D17Ae01De6D49aab45668601591FF283dee"}
   "0x74907ad4E79b1Ce415caB26FEf526ae017598cEe" {:name "SNX/FTM Beefy Finance Vault"
                                                 :token "0x06d173628be105fe81f1c82c9979ba79ebcafcb7"
                                                 :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 :address "0x74907ad4E79b1Ce415caB26FEf526ae017598cEe"}
   "0x2BDA70d1DcE6b0855e812daaBB096F3DaaEBd4Bc"  {:name "CREAM/FTM Beefy Finance Vault"
                                                  :token "0xb77b223490e1f5951ec79a8d09db9eab2adcb934"
                                                  :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                  :address "0x2BDA70d1DcE6b0855e812daaBB096F3DaaEBd4Bc"}
   "0xF5Bf6b3624eb10Ee855FEC1C5a4af81D90996b6c" {:name "COVER/FTM Beefy Finance Vault"
                                                 :token "0x5dc7848bf215f1d99f2af3d2bf78fcdf238ee34b"
                                                 :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 :address "0xF5Bf6b3624eb10Ee855FEC1C5a4af81D90996b6c"}
   "0xC5b2a6aB801E74F098aCC8Bb62B786b47319c4D9" {:name "BNB/FTM Beefy Finance Vault"
                                                 :address "0xC5b2a6aB801E74F098aCC8Bb62B786b47319c4D9"
                                                 :token "0x956DE13EA0FA5b577E4097Be837BF4aC80005820"
                                                 :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"}
   "0x711969A90C9EDD815A5C2b441FC80d067EC5E969" {:name "LINK/FTM Beefy Finance Vault"
                                                 :token "0x89d9bc2f2d091cfbfc31e333d6dc555ddbc2fd29"
                                                 :router "0xf491e7b69e4244ad4002bc14e878a34207e38c29"
                                                 :address "0x711969A90C9EDD815A5C2b441FC80d067EC5E969"}})

(def matic-vaults
  {"0xf26607237355D7c6183ea66EC908729E9c6eEB6b" {:name "wBTC-ETH Beefy Finance Vault"
                                                 :platform :beefy
                                                 :token "0xdC9232E2Df177d7a12FdFf6EcBAb114E2231198D"
                                                 :router "0xa5E0829CaCEd8fFDD4De3c43696c57F7D7A678ff"
                                                 :address "0xf26607237355D7c6183ea66EC908729E9c6eEB6b"}
   "0x82303a4b2c821204A84AB2a068eC8EDf3Bc23061" {:name "mOCEAN-MATIC Beefy Finance Vault"
                                                 :platform :beefy
                                                 :token "0x5a94F81D25c73eDdBDD84b84E8F6D36C58270510"
                                                 :router "0xa5E0829CaCEd8fFDD4De3c43696c57F7D7A678ff"
                                                 :address "0x82303a4b2c821204A84AB2a068eC8EDf3Bc23061"}
   "0xf2E8fC408d77e8fC012797654D76ed399BFcE174" {:name "ETH-MATIC LP Polycat Vault"
                                                 :platform :polycat
                                                 :token "0xadbF1854e5883eB8aa7BAf50705338739e558E5b"
                                                 :router "0xa5E0829CaCEd8fFDD4De3c43696c57F7D7A678ff"
                                                 :address "0xf2E8fC408d77e8fC012797654D76ed399BFcE174"}

   ;; this vault requires an intermediate step
   ;; need to go through quick to get ANY otherwise u get fucked
   #_"0x2849095eE44eCd5f60Ed04f94e5BB45623A8e75a" #_{:name "ANY-QUICK LP Beefy Finance Vault"
                                                     :token "0xeb275d1d930F157504cca7D7AFCe38360C7302b5"
                                                     :router "0xa5E0829CaCEd8fFDD4De3c43696c57F7D7A678ff"
                                                     :address "0x2849095eE44eCd5f60Ed04f94e5BB45623A8e75a"}})
